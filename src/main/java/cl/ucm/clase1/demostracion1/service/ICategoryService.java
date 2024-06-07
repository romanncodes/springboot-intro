package cl.ucm.clase1.demostracion1.service;

import cl.ucm.clase1.demostracion1.entity.CategoryEntity;

import java.util.List;

public interface ICategoryService {

    List<CategoryEntity> getCategories();
    CategoryEntity save(CategoryEntity categoryEntity);

}
