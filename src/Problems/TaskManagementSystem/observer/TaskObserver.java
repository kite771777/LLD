package Problems.TaskManagementSystem.observer;

import Problems.TaskManagementSystem.models.Task;

public interface TaskObserver {
    void update(Task task, String changeType);
}
