import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f \n",pi);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Your integer input will be saved in a variable.");
//        int userInt = sc.nextInt();
//        System.out.printf("Your integer is %d",userInt);
//
//        Scanner sb = new Scanner(System.in);
//        System.out.println("Enter 3 words");
//        String one = sb.next();
//        String two = sb.next();
//        String three = sb.next();
//        System.out.println(one);
//        System.out.println(two);
//        System.out.println(three);
//        System.out.printf("You entered %s %s %s",one,two,three);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Where is the Dutchman's Treasure?");
//        String input = sc.nextLine();
//        System.out.printf("%s? He pantomimed sarcastically.",input);

        Scanner sa = new Scanner(System.in);
        sa.useDelimiter("\n");
        System.out.println("Enter the length, width then height of the classroom");
        int length = Integer.parseInt(sa.next());
        int width = Integer.parseInt(sa.next());
        int height = Integer.parseInt(sa.next());
        System.out.printf("The area of a room %s' wide and %s' long is: "  + (length * width) +" square feet.\n", width,length);
        System.out.println("The perimeter is " + ((width * 2) + (length * 2)) + " linear feet.");
        System.out.println("The volume is " + ((length * width *  height)/27) + " cubic yards.");



        Scanner sb = new Scanner(System.in);
        sb.useDelimiter("\n");
        int area = length * width;
        int perimeter = (length * 2) + (width * 2);
        int volume = (length * width * height)/27;
        System.out.printf("The area is %s square feet.",area);
        System.out.printf("The perimeter is %s linear feet.",perimeter);
        System.out.printf("The volume is %s cubic yards.",volume);

    }
}

