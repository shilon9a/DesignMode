package Filter.Criteria.impl;

import Filter.Criteria.Criteria;
import Filter.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> persons=new ArrayList<>();
        for(Person person:personList){
            String gender = person.getGender();
            if(gender.equals("Male")){
                persons.add(person);
            }
        }
        return persons;
    }
}
