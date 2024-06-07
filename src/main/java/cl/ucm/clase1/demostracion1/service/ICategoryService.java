package cl.ucm.clase1.demostracion1.service;

import cl.ucm.clase1.demostracion1.entity.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> getCategories();
    Category save(Category category);

}
