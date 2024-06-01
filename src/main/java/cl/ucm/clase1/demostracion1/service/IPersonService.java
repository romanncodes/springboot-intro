package cl.ucm.clase1.demostracion1.service;

import cl.ucm.clase1.demostracion1.dto.Person;

import java.util.List;

public interface IPersonService {

    List<Person> personList();

    String sumar(String num1, String num2);

}
