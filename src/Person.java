import java.util.Arrays;
public class Person {
    public String name;

    public Person() {
        // default constructor
        System.out.println("A person is being constructed");
    }
       public Person(String name) {
        // calling method with passed String will add String to Person.name field
            this.name = name;
        }
public String getName(){
        return this.name;
}
        public static Person[] addPerson(Person[] people, Person person){
        Person[] newPeopleArray = Arrays.copyOf(people,people.length + 1);
        newPeopleArray[people.length - 1] = person;
        return newPeopleArray;
    }

    public String sayHello() {
        return String.format("%s says hello!", this.name);
    }


    public static void main(String[] args) {
        Person p1 = new Person("Jim"); //will bypass default constructor
        Person p2 = new Person();
        p2.name = "Jom"; //bypasses naming method
        System.out.println(p1.sayHello());
        System.out.println(p2.sayHello());
    }
}
