package application;

import Category.Category;
import Category.CategoryRepository;
import Person.Person;
import Task.Task;
import Task.TaskRepository;
import application.Task.TaskService;
import Person.PersonRepository;
import application.Category.CategoryService;
import application.Person.PersonService;


public class TaskManager {

    private final TaskService taskService;
    private final CategoryService categoryService;
    private final PersonService personService;

    public TaskManager(TaskRepository taskRepository, CategoryRepository categoryRepository, PersonRepository personRepository) {
        this.taskService = new TaskService(taskRepository);
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

    public boolean isCategoryUsedByAnyTask(Category category) {
        for (Task task: getTaskService().getAllTasks()) {
            if (task.getCategory() == category) {
                return true;
            }
        }
        return false;
    }

    public boolean isPersonUsedByAnyTask(Person person) {
        for (Task task: getTaskService().getAllTasks()) {
            if (task.getResponsiblePerson() == person) {
                return true;
            }
        }
        return false;
    }


}
