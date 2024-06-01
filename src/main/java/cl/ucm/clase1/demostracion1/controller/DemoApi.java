package cl.ucm.clase1.demostracion1.controller;


import cl.ucm.clase1.demostracion1.dto.Person;
import cl.ucm.clase1.demostracion1.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DemoApi {

    @Autowired
    private IPersonService service;


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


}
