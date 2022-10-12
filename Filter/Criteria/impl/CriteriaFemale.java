package Filter.Criteria.impl;

import Filter.Criteria.Criteria;
import Filter.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> peopleList) {
        List<Person> persons=new ArrayList<>();

        for(Person person:peopleList){
            String gender = person.getGender();
            if(gender.equalsIgnoreCase("Female")){
                persons.add(person);
            }
        }
        return persons;
    }
}
