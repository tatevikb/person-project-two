import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void readDataFromFile(PersonList people) {
        try (var reader = Files.newBufferedReader(Path.of("C:\\Projects\\NewPersonProject\\src\\mypeople.csv"))) {
            while( reader.ready()) {
                var p = Person.valueOf(reader.readLine());
                people.add(p.getEmail(), p);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        readDataFromFile(personList);
        personList.groupByName();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        personList.groupByAge();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        personList.groupBySalary();
    }
}
