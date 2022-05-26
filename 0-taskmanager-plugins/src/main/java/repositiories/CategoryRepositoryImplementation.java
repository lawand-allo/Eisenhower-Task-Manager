package repositiories;

import Category.Category;
import Category.CategoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CategoryRepositoryImplementation implements CategoryRepository {
    private final List<Category> categoryList;

    public CategoryRepositoryImplementation() {
        this.categoryList = new ArrayList<>();
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryList;
    }

    @Override
    public Category getCategoryByUuid(UUID uuid) {
        for (Category category: categoryList) {
            if (category.getUuid() == uuid) {
                return category;
            }
        }
        return null;
    }

    @Override
    public void removeCategory(Category category) {
        categoryList.remove(category);
    }

    @Override
    public void addCategory(Category category) {
        categoryList.add(category);
    }
}
