public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;
        while (i <= 15){
            System.out.println(i);
            i++;
        }

//            int y = 0;
//            do {
//                y += 2;
//                System.out.println(y);
//            }while (y < 1000000);

//                int y = 100;
//                do {
//                    y -= 5;
//                    System.out.println(y);
//                }while (y > -10);

                long y = 2;
                do {
                    System.out.println(y);
                    y *= y;
                }while (y < 1000000);


        for (int l = 1; l <= 100; l++) {
            if (l % 15 == 0) {
                System.out.printf("%d fizzBuzz\n",l);
            } else if (l % 3 == 0) {
                System.out.printf("%d fizz\n",l);
            } else if (l % 5 == 0) {
                System.out.printf("%d buzz\n",l);

            } else {
                System.out.println(l);
            }

        }
    }
}

