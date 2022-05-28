package repositiories;

import Category.Category;
import Category.CategoryRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    public void removeCategory(Category category) {
        categoryList.remove(category);
    }

    @Override
    public void updateCategory(Category updatedCategory) {

        for (Iterator<Category> it = categoryList.iterator(); it.hasNext(); ) {
            Category category = it.next();
            if (category.getUuid() == updatedCategory.getUuid()) {
                it.remove();
            }
        }
        categoryList.add(updatedCategory);

    }

    @Override
    public void addCategory(Category category) {
        categoryList.add(category);
    }
}
