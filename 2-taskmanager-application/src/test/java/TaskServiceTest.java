import Task.Task;
import Task.TaskRepository;
import application.Task.TaskService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class TaskServiceTest {


    @Test
    void creatService() {
        TaskRepository mockTaskRepository = mock(TaskRepository.class);
        TaskService taskService = new TaskService(mockTaskRepository);
        taskService.addTask( mock(Task.class));
    }
}
