package Assignment32;

import java.util.ArrayList;
import java.util.List;

public class Task18 {
    public static void main(String[] args) {

        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}
class Person implements RepkaItem {
    private String name;
    private String namePadezh;
    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNamePadezh() {
        return namePadezh;
    }
    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }
    public void pull(Person person){
        System.out.println(name + " за " + person.getNamePadezh());
    }
}
interface RepkaItem {
    public String getNamePadezh();
}
class RepkaStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;
        for (int i = items.size() - 2; i > 0; i--) {
            first = items.get(i);
            second = items.get(i - 1);
            first.pull(second);
        }
    }
}
