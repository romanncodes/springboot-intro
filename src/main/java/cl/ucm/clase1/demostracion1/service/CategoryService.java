package cl.ucm.clase1.demostracion1.service;

import cl.ucm.clase1.demostracion1.entity.Category;
import cl.ucm.clase1.demostracion1.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private CategoryRepository repository;

    @Override
    public List<Category> getCategories() {
        return repository.findAll();
    }

    @Override
    public Category save(Category category) {
        return repository.save(category);
    }
}
