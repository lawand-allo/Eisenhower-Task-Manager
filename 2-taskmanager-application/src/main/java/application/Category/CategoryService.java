package application.Category;

import Category.Category;
import Category.CategoryRepository;

import java.util.List;

public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.getAllCategories();
    }

    public void addCategory(Category category) {
        categoryRepository.addCategory(category);
    }

    public void deleteCategory(Category category) {
        categoryRepository.removeCategory(category);
    }
}
