package Task;

import Category.CategoryRepository;

public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository, CategoryRepository categoryRepository) {
        this.taskRepository = taskRepository;
    }

}
