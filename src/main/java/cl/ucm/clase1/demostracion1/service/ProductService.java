package cl.ucm.clase1.demostracion1.service;

import cl.ucm.clase1.demostracion1.entity.ProductEntity;
import cl.ucm.clase1.demostracion1.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository repository;

    @Override
    public List<ProductEntity> getProducts() {
        return repository.findAll();
    }

    @Override
    public ProductEntity saveProduct(ProductEntity product) {
        return repository.save(product);
    }

    @Override
    public List<ProductEntity> getProductsMayorA(int monto) {
        return repository.getProductsMayor(monto);
    }
}
