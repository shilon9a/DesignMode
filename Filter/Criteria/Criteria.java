package Filter.Criteria;

import Filter.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> personList);
}
