package GUI;

import javax.swing.*;

public class CategoriesView extends JFrame{
    private JPanel contentPane;
    private JList categoriesJList;
    private JButton addCategoryButton;
    private RegularTaskManagerView parent;

    public CategoriesView() {
        setContentPane(contentPane);
        setTitle("Categories");
        setSize(400, 400);
        setVisible(true);
        addCategoryButton.addActionListener(e -> {
            AddCategoryView addCategoryView = new AddCategoryView();
        });
    }

    private void updateCategoriesList() {

    }
}
