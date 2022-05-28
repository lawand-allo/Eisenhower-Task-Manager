import Category.Category;
import Category.CategoryRepository;
import Person.Person;
import Person.PersonRepository;
import Task.Task;
import Task.TaskRepository;
import application.TaskManager;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class TaskManagerTest {

    @Test
    void createTaskManager() {
        TaskRepository mockTaskRepo = mock(TaskRepository.class);
        CategoryRepository mockCategoryRepo = mock(CategoryRepository.class);
        PersonRepository mockPersonRepo = mock(PersonRepository.class);
        TaskManager taskManager = new TaskManager(mockTaskRepo, mockCategoryRepo, mockPersonRepo);
        assertNotNull(taskManager.getTaskService());
        assertNotNull(taskManager.getPersonService());
        assertNotNull(taskManager.getCategoryService());
    }

    @Test
    void testPersonInUse() {
        TaskRepository mockTaskRepo = mock(TaskRepository.class);
        CategoryRepository mockCategoryRepo = mock(CategoryRepository.class);
        PersonRepository mockPersonRepo = mock(PersonRepository.class);
        TaskManager taskManager = new TaskManager(mockTaskRepo, mockCategoryRepo, mockPersonRepo);
        Task mockTask = mock(Task.class);
        Person mockPerson = mock(Person.class);
        Person otherMockPerson = mock(Person.class);
        Mockito.doReturn(mockPerson).when(mockTask).getResponsiblePerson();
        List<Task> tasks = new ArrayList<>();
        tasks.add(mockTask);
        tasks.add(mockTask);

        Mockito.doReturn(tasks).when(mockTaskRepo).getAllTasks();
        assertTrue(taskManager.isPersonUsedByAnyTask(mockPerson));
        assertFalse(taskManager.isPersonUsedByAnyTask(otherMockPerson));
    }

    @Test
    void testCategoryInUse() {
        TaskRepository mockTaskRepo = mock(TaskRepository.class);
        CategoryRepository mockCategoryRepo = mock(CategoryRepository.class);
        PersonRepository mockPersonRepo = mock(PersonRepository.class);
        TaskManager taskManager = new TaskManager(mockTaskRepo, mockCategoryRepo, mockPersonRepo);
        Task mockTask = mock(Task.class);
        Category mockCategory = mock(Category.class);
        Category otherMockCategory = mock(Category.class);
        Mockito.doReturn(mockCategory).when(mockTask).getCategory();

        List<Task> tasks = new ArrayList<>();
        tasks.add(mockTask);
        tasks.add(mockTask);

        Mockito.doReturn(tasks).when(mockTaskRepo).getAllTasks();

        assertTrue(taskManager.isCategoryUsedByAnyTask(mockCategory));
        assertFalse(taskManager.isCategoryUsedByAnyTask(otherMockCategory));
    }

}

