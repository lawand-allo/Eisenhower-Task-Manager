package application.Task;

import Category.Category;
import Category.CategoryRepository;
import Person.Person;
import Task.Task;
import Task.TaskRepository;
import Task.Status;
import java.util.List;

public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository, CategoryRepository categoryRepository) {
        this.taskRepository = taskRepository;
    }

    public void addTask(Task task) {
        taskRepository.addTask(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.getAllTasks();
    }

    public List<Task> getTasksByCategory(Category category) {
        return taskRepository.getTasksByCategory(category);
    }

    public List<Task> getTasksByPerson(Person person) {
        return taskRepository.getTasksByResponsiblePerson(person);
    }

    public List<Task> getTasksByStatus(Status status) {
        return taskRepository.getTasksByStatus(status);
    }



}