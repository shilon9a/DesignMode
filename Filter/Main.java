package Filter;

import Filter.Criteria.Criteria;
import Filter.Criteria.impl.CriteriaFemale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person2=new Person("shiron","Male",12);
        Person person1=new Person("ccl","Female",23);
        List<Person> personList=new ArrayList<>();
        personList.add(person2);
        personList.add(person1);
        Criteria criteria=new CriteriaFemale();
        List<Person> people = criteria.meetCriteria(personList);

        for(Person person:people){
            System.out.println(person.getName());
        }
    }
}
