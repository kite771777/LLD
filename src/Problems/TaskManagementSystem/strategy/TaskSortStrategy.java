package Problems.TaskManagementSystem.strategy;

import Problems.TaskManagementSystem.models.Task;

import java.util.List;

public interface TaskSortStrategy {
    void sort(List<Task> tasks);
}
