package Task;

import Category.Category;
import Person.Person;

import java.util.List;
import java.util.UUID;

public interface TaskRepository {


    List<Task> getAllTasks();

    Task getTaskByUuid(UUID uuid);

    List<Task> getTasksByResponsiblePerson(Person responsiblePerson);

    List<Task> getTasksByCategory(Category category);

    List<Task> getOpenTasks();

    List<Task> getInProgressTasks();

    List<Task> getImportantTasks();

    List<Task> getUrgentTasks();

    List<Task> getUnimportantTasks();

    List<Task> getNotUrgentTasks();

    void addTask(Task task);

    void removeTask(Task task);



}
