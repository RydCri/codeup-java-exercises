import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }
//
////            int y = 0;
////            do {
////                y += 2;
////                System.out.println(y);
////            }while (y < 1000000);
//
////                int y = 100;
////                do {
////                    y -= 5;
////                    System.out.println(y);
////                }while (y > -10);
//
//                long y = 2;
//                do {
//                    System.out.println(y);
//                    y *= y;
//                }while (y < 1000000);
//
//
//        for (int l = 1; l <= 100; l++) {
//            if (l % 15 == 0) {
//                System.out.printf("%d fizzBuzz\n",l);
//            } else if (l % 3 == 0) {
//                System.out.printf("%d fizz\n",l);
//            } else if (l % 5 == 0) {
//                System.out.printf("%d buzz\n",l);
//
//            } else {
//                System.out.println(l);
//            }
//        }

//        Scanner sg = new Scanner(System.in);
//        System.out.print("What number would you like to go up to?");
//        String userIn = sg.nextLine();
//        int userNum = Integer.parseInt(userIn);
//            System.out.printf("number | squared | cubed\n------ | ------- | -------\n");
//        for (int i = 1; i <= userNum; i++) {
//            System.out.println(i + "      | " + i*userNum*userNum + "      | " + i*userNum*userNum*userNum);
//        }

        Scanner sh = new Scanner(System.in);
        System.out.println("Enter grade number to return a letter grade:");
        int grade = sh.nextInt();
        if(grade >= 88){
            System.out.println("A");
        }
        else if(grade >= 80 && grade < 87){
            System.out.println("B");
        }
        else if(grade >= 67 && grade < 79){
            System.out.println("C");
        }
        else if(grade >= 60 && grade < 66){
            System.out.println("D");
        }
        else if(grade >= 0 && grade < 59){
            System.out.println("F");
        }
    }
}
