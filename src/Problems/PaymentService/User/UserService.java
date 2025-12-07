package Problems.PaymentService.User;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class UserService {
    // Store users in a thread-safe list (important if accessed concurrently)
    private static final List<User> userList = Collections.synchronizedList(new ArrayList<>());

    public UserDO addUser(UserDO userDO){
        User user=new User();
        user.setUserId(ThreadLocalRandom.current().nextInt(10, 100));
        user.setUserName(userDO.getName());
        user.setEmail(userDO.getEmail());
        user.setPhoneNumber(userDO.getPhoneNumber());
        userList.add(user);
        return convertUserToUserDO(user);
    }
    public UserDO getUserByUserId(int userId){
        return userList.stream()
                .filter(user -> user.getUserId() == userId)
                .findFirst()
                .map(this::convertUserToUserDO)
                .orElse(null);
    }
    public Optional<UserDO> getUserByEmail(String email) {
        return userList.stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .map(this::convertUserToUserDO);
    }
    public List<UserDO> getAllUsers() {
        synchronized (userList) {
            return userList.stream()
                    .map(this::convertUserToUserDO)
                    .toList();
        }
    }
    public UserDO convertUserToUserDO(User user){
        UserDO userDO=new UserDO();
        userDO.setName(user.getUserName());
        userDO.setEmail(user.getEmail());
        userDO.setUserId(user.getUserId());
        userDO.setPhoneNumber(user.getPhoneNumber());
        return userDO;
    }
}
