package Animals;

public class Animals {
    protected static int numberOfLegs;
    protected static String preferredClimate;

    public Animals(int numberOfLegs,String preferredClimate){
    numberOfLegs = this.numberOfLegs;
    preferredClimate = this.preferredClimate;
    }
//    public String getAnimalInfo(){
//
//    }



    public static void main(String[] args) {

    }
}

/*
- add the following fields:
	- ```private int numberOfLegs```
	- ```private String preferredClimate```
	- ```public String getAnimalInfo()```: a method that returns a message with number of legs and preferred climate info
- add getters and setters
- add a constructor that sets all properties

Create a class of Dog, Fish, Cat that extends Animal

- add additional private properties that are unique to each specific animal type and getters and setters for these properties
- overload the getAnimalInfo() to invoke the parent getAnimalInfo() method and return extra info on all the additional properties for the specific animal type
- add a constructor that invokes the parent constructor and sets new properties

Create a class AnimalTester with a method ```public static void displayAnimalDetails(Animal a)``` that prints what is returned from calling the getAnimalInfo() method for a given animal object

- this method should take in any Animal object but test it in the main method
with instantiated Dog, Fish, Cat objects of type Animal.
 */