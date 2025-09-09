package Problems.TaskManagementSystem.state;

import Problems.TaskManagementSystem.enums.TaskStatus;
import Problems.TaskManagementSystem.models.Task;

public interface TaskState {
    void startProgress(Task task);
    void completeTask(Task task);
    void reopenTask(Task task);
    TaskStatus getStatus();
}
