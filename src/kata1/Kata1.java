package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Ana ", new Date(97,9,24));
        System.out.println(person.getName() + "tiene " + 
                person.getAge() + " años");
    }
}
