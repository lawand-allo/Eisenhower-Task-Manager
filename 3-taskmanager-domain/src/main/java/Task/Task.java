package Task;

import Category.Category;
import Person.Person;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Task {

    private String name;
    private String note;
    private Category category;
    private Date dueDate;
    private Person responsiblePerson;
    private Status status;
    private boolean isImportant;
    private boolean isUrgent;
    private final UUID uuid;

    public Task(String name, String note, Category category, Date dueDate, Person responsiblePerson, boolean isImportant, boolean isUrgent) {
        this.name = name;
        this.note = note;
        this.category = category;
        this.dueDate = dueDate;
        this.responsiblePerson = responsiblePerson;
        this.status = Status.OPEN;
        this.isImportant = isImportant;
        this.isUrgent = isUrgent;
        this.uuid = UUID.randomUUID();
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

    public Person getResponsiblePerson() {
        return responsiblePerson;
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

    public void setResponsiblePerson(Person responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
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

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return isImportant == task.isImportant && isUrgent == task.isUrgent && Objects.equals(name, task.name) && Objects.equals(note, task.note) && Objects.equals(category, task.category) && Objects.equals(dueDate, task.dueDate) && Objects.equals(responsiblePerson, task.responsiblePerson) && status == task.status && Objects.equals(uuid, task.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, note, category, dueDate, responsiblePerson, status, isImportant, isUrgent, uuid);
    }
}
