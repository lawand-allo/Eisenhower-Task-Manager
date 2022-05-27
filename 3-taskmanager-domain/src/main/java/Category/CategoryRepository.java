package Category;

import java.util.List;
import java.util.UUID;

public interface CategoryRepository {

    List<Category> getAllCategories();

    Category getCategoryByUuid(UUID uuid);

    void addCategory(Category category);

    void removeCategory(Category category);

    void updateCategory(Category updatedCategory);


}
