import java.util.Scanner;
import java.lang.Math;
public class MethodsExercises {

    public static int Add(int num1, int num2){
        return num1 + num2;
    }
    public static int Subtract(int num1, int num2){
        return num1 - num2;
    }
    public static int Mulitply(int num1, int num2){
        return num1 * num2;
    }
    public static int Divide(int num1, int num2){
        return num1 / num2;
    }
    public static int Modulus(int num1, int num2){
        return num1 % num2;
    }
    public static void sayName(String name1,String name2){
    System.out.println(name1 +" "+ name2);
}
    public static void getInteger(int min, int max){

           System.out.printf("Enter number between %d and %d\n", min, max);
           Scanner sc = new Scanner(System.in);
           int userInput = sc.nextInt();
           if (userInput >= min && userInput <= max) {
               System.out.printf("Your number '%d' is accepted\n", userInput);
           } else {
               System.out.printf("Your number '%d' is not within range\n", userInput);
           }
    }
    public static void Factorial(int input) {
        int inc = 1;
        for (int i = 1; i <= input; i += 1) {
            System.out.println(inc *= i);
        }
    }
    public static void countDown(int num) {
        if(num == 0) return;
        System.out.println(num);
        countDown(num - 1);
    }
    public static int Dice(){
    System.out.println("Enter number of sides on dice");
        Scanner st = new Scanner(System.in);
        int sides = st.nextInt();
        int roll1 = (int) ((int) 1 + Math.random() * sides);
        int roll2 = (int) ((int) 1 + Math.random() * sides);

            System.out.println("Rolling the dice!");
            System.out.println(roll2);
                return roll1;
    }




        public static void main (String[]args){
            sayName("jim","jom");
            getInteger(4,8);
            countDown(6);
            Factorial(8);
       }
   }
