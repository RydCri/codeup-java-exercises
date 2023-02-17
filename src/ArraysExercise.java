import java.util.Arrays;

public class ArraysExercise {
       public static Person[] personArray = new Person[3];
       //index of 3 creates null exception to Person object in final array index, 4 creates indexBreakout exception
    int[] numbers = {1, 2, 3, 4, 5};
    public static Person p1 = new Person("Em");
    public ArraysExercise() {
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(personArray));
    }


    public static void main(String[] args) {
        personArray[0] = new Person("Jim");
        personArray[1] = new Person("Jom");
        personArray[2] = new Person("Yomithy");


                personArray = Person.addPerson(personArray, p1);

        for (Person person : personArray)  {
            System.out.println(person.getName());
        }
    }
}
