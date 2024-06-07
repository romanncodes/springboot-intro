package cl.ucm.clase1.demostracion1.repository;

import cl.ucm.clase1.demostracion1.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductRepository extends JpaRepository<ProductEntity, Integer> {

    // obtener los producto cuyo precio sea mayor a un monto ingresado

    @Query(value = "select * from product where price>?", nativeQuery = true)
    List<ProductEntity> getProductsMayor(int monto);
}
