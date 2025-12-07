package Problems.PaymentService.User;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserController {

    private static final Logger log = Logger.getLogger(UserController.class.getName());

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserDO addUser(UserDO userDO) {
        if (userDO == null || userDO.getName() == null || userDO.getEmail() == null) {
            log.log(Level.SEVERE, "Invalid user data received: {0}", userDO);
            throw new IllegalArgumentException("User data is incomplete.");
        }

        log.log(Level.INFO, "Adding new user: {0}", userDO.getEmail());
        UserDO createdUser = userService.addUser(userDO);
        log.log(Level.INFO, "User created successfully with ID: {0}", createdUser.getUserId());
        return createdUser;
    }

    public UserDO getUserByUserId(int userId) {
        log.log(Level.FINE, "Fetching user with ID: {0}", userId);
        UserDO user = userService.getUserByUserId(userId);
        if (user == null) {
            log.log(Level.WARNING, "User with ID {0} not found.", userId);
        }
        return user;
    }

    public Optional<UserDO> getUserByEmail(String email) {
        log.log(Level.FINE, "Fetching user with email: {0}", email);
        return userService.getUserByEmail(email);
    }

    public List<UserDO> getAllUsers() {
        log.log(Level.FINE, "Fetching all users");
        return userService.getAllUsers();
    }
}
