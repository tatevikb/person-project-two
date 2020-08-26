import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonList {
    private Map<String,Person> persons = new HashMap<>();

    public void add(String email, Person person) {
        persons.put(email, person);
    }

    public void groupByName() {
        Map<String,List<Person>> groups = new HashMap<>();

        for(Person person : persons.values()) {
            var name = person.getName();
            if(!groups.containsKey(name)) {
                groups.put(name,new ArrayList<>());
            }
            groups.get(person.getName()).add(person);
        }

        printGroups("Name", groups);
    }

    public void groupByAge() {
        Map<Integer,List<Person>> groups = new HashMap<>();

        for(Person person : persons.values()) {
            var age = person.getAge();
            if(!groups.containsKey(age)) {
                groups.put(age,new ArrayList<>());
            }
            groups.get(person.getAge()).add(person);
        }

        printGroups("Age", groups);
    }

    public void groupBySalary() {
        Map<Double,List<Person>> groups = new HashMap<>();

        for(Person person : persons.values()) {
            var salary = person.getSalary();
            if(!groups.containsKey(salary)) {
                groups.put(salary,new ArrayList<>());
            }
            groups.get(person.getSalary()).add(person);
        }

        printGroups("Salary", groups);
    }

    /**
     * Prints the list of the people with same name/salary/age.
     * @param selector
     * @param groups
     * @param <E>
     */
    private <E> void printGroups(String selector, Map<E,List<Person>> groups) {
        for(var list : groups.entrySet()) {
            System.out.println(selector + " " + list.getKey());
            for(var person : list.getValue())
                System.out.println(person);
        }
    }
}
