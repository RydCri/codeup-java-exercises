package util;

public class Scanner {

    public String input;
    public String bool;
    public int integer;
    public double dbl;

    public Scanner() {
        System.out.println("A new Scanner has been created: Your input will populate its fields:");
    }

    public void getString() {
        System.out.println("Enter a string:");
        this.input = System.console().readLine();
        System.out.println("\nString value: " + input + "\n=============");
    }

    public void yesNo() {
        System.out.println("Entering y/yes or n/no returns Boolean value: \n");
        this.bool = (System.console().readLine());
        if (this.bool.matches("(?i)y|yes|true")) {
            this.bool = String.valueOf(true);
        } else if (this.bool.matches("(?i)n|no|false")) {
            this.bool = String.valueOf(false);
        } else {
            this.bool = null;
        }
        System.out.println("\nBoolean is " + bool + "\n=============");
    }

    public void getInt(int min, int max) {
        System.out.println("Enter a number between 1 and 10,\n I'll keep asking until you do.");
        this.integer = Integer.parseInt(System.console().readLine());
        while (this.integer < min || this.integer > max) {
            System.out.println("Nope, try again");
            this.integer = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Thank you"  + "\n=============");
    }


    public void getDouble(double min, double max) {
        System.out.println("Enter a double between 1.00001 and 1.99999,\n Again, I'll keep asking.");
        this.dbl = Double.parseDouble(System.console().readLine());
        while (this.dbl < min || this.dbl > max) {
            System.out.println("Nope, try again\n");
            this.dbl = Double.parseDouble(System.console().readLine());
        }
        System.out.println("Thank you" + "\n=============" + "\nEnd of input" + "\n=============");
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner();
        sc.getString();
        sc.yesNo();
        sc.getInt(1,10);
        sc.getDouble(1.00001d,1.99999d);
}
}