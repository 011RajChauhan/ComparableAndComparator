package com.rajan;

import com.rajan.model.Person;
import com.rajan.model.PersonAgeComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person personArray[] = {
                new Person("rajan", "chauhan",5),
                new Person("sandeep", "chauhan",4),
                new Person("bhagat", "Singh",11),
                new Person("Ajay", "Arya",2)
        };

        List<Person> personList = Arrays.asList(personArray);

        /*System.out.println("before sorting the list...");
        System.out.println(personList);

        Collections.sort(personList);

        System.out.println("after sorting the list");
        System.out.println(personList);*/

        Collections.sort(personList,new PersonAgeComparator());
        System.out.println(personList);

    }
}
