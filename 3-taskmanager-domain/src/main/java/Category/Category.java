package Category;

import java.awt.*;
import java.util.Objects;
import java.util.UUID;

public class Category {
    private String name;
    private Color color;
    private final UUID uuid;

    public Category(String name, Color color) {
        this.name = name;
        this.color = color;
        this.uuid = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) && Objects.equals(color, category.color) && Objects.equals(uuid, category.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, uuid);
    }

    @Override
    public String toString() {
        return name;
    }
}
