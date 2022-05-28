package Task;

import Category.Category;
import Person.Person;

import java.util.List;
import java.util.UUID;

public interface TaskRepository {


    List<Task> getAllTasks();

    List<Task> getTasksByResponsiblePerson(Person responsiblePerson);

    List<Task> getTasksByCategory(Category category);

    List<Task> getTasksByStatus(Status status);

    List<Task> getTaskByImportanceAndUrgency(boolean important, boolean urgent);

    void addTask(Task task);

    void removeTask(Task task);


    void updateTask(Task task);
}
