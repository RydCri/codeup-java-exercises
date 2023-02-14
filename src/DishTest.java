public class DishTest {



    public static void main(String[] args) {
    Dish dish1 = new Dish();
         dish1.nameOfDish = "Spaghetti";
         dish1.costInCents = 99;
         dish1.wouldRecommend = true;

    Dish dish2 = new Dish();
         dish2.nameOfDish = "Pepper Chicken";
         dish2.costInCents = 150;
         dish2.wouldRecommend = false;

            dish1.printSummary();
            dish2.printSummary();
    }
}
