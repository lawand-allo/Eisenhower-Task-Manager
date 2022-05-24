package Category;

import java.awt.*;
import java.util.Objects;

public class Category {
    private String name;
    private Color color;

    public Category(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) && Objects.equals(color, category.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
