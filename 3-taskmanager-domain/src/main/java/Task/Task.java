package Task;

import Category.Category;
import Person.Person;

import java.util.Date;
import java.util.List;

public class Task {

    private String name;
    private String note;
    private Category category;
    private Date dueDate;
    private List<Person> responsiblePersons;
    private Status status;
    private boolean isImportant;
    private boolean isUrgent;

    public Task(String name, String note, Category category, Date dueDate, List<Person> responsiblePersons, boolean isImportant, boolean isUrgent) {
        this.name = name;
        this.note = note;
        this.category = category;
        this.dueDate = dueDate;
        this.responsiblePersons = responsiblePersons;
        this.status = Status.OPEN;
        this.isImportant = isImportant;
        this.isUrgent = isUrgent;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public Category getCategory() {
        return category;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public List<Person> getResponsiblePersons() {
        return responsiblePersons;
    }

    public Status getStatus() {
        return status;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setResponsiblePersons(List<Person> responsiblePersons) {
        this.responsiblePersons = responsiblePersons;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }
}
