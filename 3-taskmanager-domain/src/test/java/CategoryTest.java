import Category.Category;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CategoryTest {

    @Test
    void createCategory() {
        String CategoryName = "homework";
        Color CategoryColor = Color.BLUE;

        Category toBeTestedCategory = new Category(CategoryName,CategoryColor);

        assertNotNull(toBeTestedCategory);
        assertEquals(toBeTestedCategory.getName(),CategoryName);
        assertEquals(toBeTestedCategory.getColor(),CategoryColor);

        assertEquals(toBeTestedCategory.toString(),CategoryName);

        String otherCategoryName = "college";
        Color otherCategoryColor = Color.BLACK;
        toBeTestedCategory.setName(otherCategoryName);
        toBeTestedCategory.setColor(otherCategoryColor);
        assertEquals(toBeTestedCategory.getName(),otherCategoryName);
        assertEquals(toBeTestedCategory.getColor(),otherCategoryColor);
    }

    @Test
    void compareCategorys() {
        String CategoryName = "shopping";
        Color CategoryColor = Color.BLUE;

        Category toBeTestedCategory = new Category(CategoryName,CategoryColor);
        Category toBeTestedCategory2 = new Category(CategoryName,CategoryColor);

        assertNotEquals(toBeTestedCategory,toBeTestedCategory2);
        assertNotEquals(toBeTestedCategory.hashCode(),toBeTestedCategory2.hashCode());

        assertNotEquals(toBeTestedCategory.getUuid(), toBeTestedCategory2.getUuid());

    }
}
