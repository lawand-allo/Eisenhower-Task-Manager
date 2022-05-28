import Category.Category;
import Category.CategoryRepository;
import application.Category.CategoryService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class CategoryServiceTest {

    @Test
    void creatService() {
        CategoryRepository mockCategoryRepository = mock(CategoryRepository.class);
        CategoryService categoryService = new CategoryService(mockCategoryRepository);
        categoryService.addCategory(mock(Category.class));
    }
}
