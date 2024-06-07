package cl.ucm.clase1.demostracion1.repository;

import cl.ucm.clase1.demostracion1.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
