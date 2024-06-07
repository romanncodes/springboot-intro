package cl.ucm.clase1.demostracion1.service;

import cl.ucm.clase1.demostracion1.entity.ProductEntity;

import java.util.List;

public interface IProductService {
    List<ProductEntity> getProducts();
    ProductEntity saveProduct(ProductEntity product);
    List<ProductEntity> getProductsMayorA(int monto);
}
