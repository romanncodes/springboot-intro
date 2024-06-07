package cl.ucm.clase1.demostracion1.repository;

import cl.ucm.clase1.demostracion1.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}
