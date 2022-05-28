import Category.Category;
import Person.Person;
import Task.Task;
import Task.Status;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.*;

import java.awt.*;
import java.util.Date;

public class TaskTest {

    @Test
    void createTask() {

        Category mockCategory = Mockito.mock(Category.class);

        Person mockPerson = Mockito.mock(Person.class);

        Date mockDate = Mockito.mock(Date.class);

        Task toBeTestedTask = new Task("test task", "no note", mockCategory, mockDate, mockPerson, true, true);

        assertNotNull(toBeTestedTask);
        assertEquals(mockCategory, toBeTestedTask.getCategory());
        assertEquals(mockPerson, toBeTestedTask.getResponsiblePerson());
        assertTrue(toBeTestedTask.isImportant());
        assertTrue(toBeTestedTask.isUrgent());

    }

    @Test
    void testTaskAttributes() {
        Category mockCategory = Mockito.mock(Category.class);
        String mockCategoryName = "homeworks";
        Color mockCategoryColor = Color.BLUE;
        Mockito.doReturn(mockCategoryName).when(mockCategory).getName();
        Mockito.doReturn(mockCategoryColor).when(mockCategory).getColor();

        Person mockPerson = Mockito.mock(Person.class);
        String mockPersonName = "max";
        String mockPersonSurname = "mustermann";
        Mockito.doReturn(mockPersonName).when(mockPerson).getName();
        Mockito.doReturn(mockPersonSurname).when(mockPerson).getSurname();

        Date date = new Date();


        String toBeTestedTaskName = "test task";
        String toBeTestedTaskNote = "no note";
        Task toBeTestedTask = new Task(toBeTestedTaskName, toBeTestedTaskNote, mockCategory, date, mockPerson, true, true);

        assertEquals(toBeTestedTask.getName(),toBeTestedTaskName);
        assertEquals(toBeTestedTask.getNote(),toBeTestedTaskNote);

        assertEquals(mockCategory, toBeTestedTask.getCategory());
        assertEquals(mockCategoryColor, toBeTestedTask.getCategory().getColor());
        assertEquals(mockCategoryName, toBeTestedTask.getCategory().getName());

        assertEquals(mockPerson, toBeTestedTask.getResponsiblePerson());
        assertEquals(mockPersonName, toBeTestedTask.getResponsiblePerson().getName());
        assertEquals(mockPersonSurname, toBeTestedTask.getResponsiblePerson().getSurname());

        assertEquals(date,toBeTestedTask.getDueDate());

        assertTrue(toBeTestedTask.isImportant());
        assertTrue(toBeTestedTask.isUrgent());


        toBeTestedTask.setUrgent(false);
        assertFalse(toBeTestedTask.isUrgent());

        toBeTestedTask.setImportant(false);
        assertFalse(toBeTestedTask.isImportant());

        Date otherDate = new Date();
        toBeTestedTask.setDueDate(otherDate);
        assertEquals(otherDate, toBeTestedTask.getDueDate());

        String anotherTaskName = "otherTaskName";
        toBeTestedTask.setName(anotherTaskName);
        assertEquals(anotherTaskName,toBeTestedTask.getName());

        String anotherTaskNote = "otherTaskNote";
        toBeTestedTask.setNote(anotherTaskNote);
        assertEquals(anotherTaskNote,toBeTestedTask.getNote());

        Category otherMockCategory = Mockito.mock(Category.class);
        Person otherMockPerson = Mockito.mock(Person.class);

        toBeTestedTask.setCategory(otherMockCategory);
        toBeTestedTask.setResponsiblePerson(otherMockPerson);

        assertEquals(toBeTestedTask.getCategory(),otherMockCategory);
        assertEquals(toBeTestedTask.getResponsiblePerson(),otherMockPerson);

    }

    @Test
    void compareTasks() {
        Category mockCategory = Mockito.mock(Category.class);

        Person mockPerson = Mockito.mock(Person.class);
        Date mockDate = Mockito.mock(Date.class);

        String toBeTestedTaskName = "test task";
        String toBeTestedTaskNote = "no note";
        Task toBeTestedTask = new Task(toBeTestedTaskName, toBeTestedTaskNote, mockCategory, mockDate, mockPerson, true, true);
        Task toBeTestedTask2 = new Task(toBeTestedTaskName, toBeTestedTaskNote, mockCategory, mockDate, mockPerson, true, true);

        assertNotEquals(toBeTestedTask.getUuid(),toBeTestedTask2.getUuid());
        assertEquals(toBeTestedTask.toString(), toBeTestedTaskName);
        assertNotEquals(toBeTestedTask.hashCode(), toBeTestedTask2.hashCode());
        assertEquals(toBeTestedTask, toBeTestedTask);
        assertNotEquals(toBeTestedTask, toBeTestedTask2);
    }

    @Test
    void testTaskStatus() {
        Category mockCategory = Mockito.mock(Category.class);
        Person mockPerson = Mockito.mock(Person.class);
        Date mockDate = Mockito.mock(Date.class);
        String toBeTestedTaskName = "test task";
        String toBeTestedTaskNote = "no note";

        Task toBeTestedTask = new Task(toBeTestedTaskName, toBeTestedTaskNote, mockCategory, mockDate, mockPerson, true, true);

        assertEquals(toBeTestedTask.getStatus(), Status.OPEN);

        toBeTestedTask.setStatus(Status.DONE);
        assertEquals(Status.DONE, toBeTestedTask.getStatus());
    }

}
