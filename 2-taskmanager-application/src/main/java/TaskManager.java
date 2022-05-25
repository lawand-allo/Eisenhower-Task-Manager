import Category.CategoryRepository;
import Person.PersonRepository;
import Task.*;


public class TaskManager {

    private final TaskRepository taskRepository;
    private final CategoryRepository categoryRepository;
    private final PersonRepository personRepository;

    private final TaskService taskService;

    private final CategoryService categoryService;
    private final PersonService personService;

    public TaskManager(TaskRepository taskRepository, CategoryRepository categoryRepository, PersonRepository personRepository) {
        this.taskRepository = taskRepository;
        this.categoryRepository = categoryRepository;
        this.personRepository = personRepository;

        this.taskService = new TaskService(taskRepository, categoryRepository);
        this.categoryService = new CategoryService(categoryRepository);
        this.personService = new PersonService(personRepository);
    }

    public TaskService getTaskService() {
        return taskService;
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public PersonService getPersonService() {
        return personService;
    }


}
