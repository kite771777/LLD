package Problems.TaskManagementSystem.state;

import Problems.TaskManagementSystem.enums.TaskStatus;
import Problems.TaskManagementSystem.models.Task;

public class InProgressState implements TaskState{
    @Override
    public void startProgress(Task task) {
        System.out.println("Task is already in progress.");
    }
    @Override
    public void completeTask(Task task) {
        task.setState(new DoneState());
    }
    @Override
    public void reopenTask(Task task) {
        task.setState(new TodoState());
    }
    @Override
    public TaskStatus getStatus() { return TaskStatus.IN_PROGRESS; }
}
