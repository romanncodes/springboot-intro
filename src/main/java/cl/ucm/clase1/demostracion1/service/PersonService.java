package cl.ucm.clase1.demostracion1.service;

import cl.ucm.clase1.demostracion1.dto.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService implements IPersonService{
    @Override
    public List<Person> personList() {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("Juan", 20);
        list.add(person1);
        list.add(new Person("Maria", 23));
        return list;
    }

    @Override
    public String sumar(String num1, String num2) {
        try{
            //camino feliz
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            int suma = n1+n2;
            return "La suma es "+suma;
        }catch (Exception ex){
            return ex.getMessage();
        }
    }
}
