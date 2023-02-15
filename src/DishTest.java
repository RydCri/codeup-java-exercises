public class DishTest {
    public static void main(String[] args) {
    Dish dish1 = new Dish();
         dish1.makeDish("Spaghetti",2099,true);
    Dish dish2 = new Dish();
         dish2.makeDish("Macaroni",1599,false);

         System.out.println("|====Dishes====|\n");
            dish1.printSummary();

            dish2.printSummary();
    }
}
