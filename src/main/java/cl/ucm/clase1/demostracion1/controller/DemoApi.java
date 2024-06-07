package cl.ucm.clase1.demostracion1.controller;


import cl.ucm.clase1.demostracion1.dto.Person;
import cl.ucm.clase1.demostracion1.entity.CategoryEntity;
import cl.ucm.clase1.demostracion1.entity.ProductEntity;
import cl.ucm.clase1.demostracion1.service.ICategoryService;
import cl.ucm.clase1.demostracion1.service.IPersonService;
import cl.ucm.clase1.demostracion1.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DemoApi {

    @Autowired
    private IPersonService service;
    @Autowired
    private ICategoryService categoryService;
    @Autowired
    private IProductService productService;


    @GetMapping("/hello")
    public String hello(){
        return "Hola Springboot";
    }

    @GetMapping("/hello2")
    public ResponseEntity<Map> hello2(){
        Map resp = new HashMap();
        resp.put("message", "Hello Spring Boot...");
        return ResponseEntity.ok(resp);
    }

    @GetMapping("/sumar")
    public ResponseEntity<Map> sumar(@RequestParam(defaultValue = "0") String num1,
                                     @RequestParam(defaultValue = "0") String num2){
        Map resp = new HashMap();
        resp.put("message", service.sumar(num1,num2));
        return ResponseEntity.ok(resp);

        // http://localhost:8085/sumar?num1=10&num2=20
        // http://localhost:8085/sumar
        // http://localhost:8085/sumar?num1=10&num2=dos
    }

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> personList(){
        return ResponseEntity.ok(service.personList());
    }


    @GetMapping("/categories")
    public ResponseEntity<?> categories(){
        return ResponseEntity.ok(categoryService.getCategories());
    }

    @PostMapping("/categories")
    public ResponseEntity<?> saveCategory(@RequestBody CategoryEntity categoryEntity){
        return ResponseEntity.ok(categoryService.save(categoryEntity));
    }

    @GetMapping("/products")
    public ResponseEntity<?> products(){
        return ResponseEntity.ok(productService.getProducts());
    }
    @GetMapping("/products/{monto}")
    public ResponseEntity<?> products(@PathVariable int monto){
        return ResponseEntity.ok(productService.getProductsMayorA(monto));
    }
    @PostMapping("/products")
    public ResponseEntity<?> saveProduct(@RequestBody ProductEntity product){
        return ResponseEntity.ok(productService.saveProduct(product));
    }



}
