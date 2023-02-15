
public class DishTools {
    public static int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(String nameOfDish) {
        System.out.println(nameOfDish.toUpperCase() + "!");
    }

    public static void analyzeDishCost(int costInCents) {
        if(costInCents < AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("Less expensive than average");
        }else if( costInCents > AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("More expensive than average");
        }
    }

    public static void flipRecommendation(boolean wouldRecommend) {
        if(wouldRecommend == true) {
            wouldRecommend = false;
            System.out.println("Would NOT recommend!");
        }else if( wouldRecommend == false) {
            wouldRecommend = true;
            System.out.println("Would recommend");
        }
    }

    public static void main(String[] args) {

        System.out.println("|====Dishes====|\n");

        Dish dish3 = new Dish();
        dish3.makeDish("Macaroni",1189,true);
        dish3.printSummary();

//      DishTools.shoutDishName(dish3.nameOfDish);
//      DishTools.analyzeDishCost(dish3.costInCents);
//      DishTools.flipRecommendation(dish3.wouldRecommend);

        Dish dish4 = new Dish();
        dish4.makeDish("Zuccatii",2411,false);
        dish4.printSummary();

//        DishTools.shoutDishName(dish4.nameOfDish);
//        DishTools.analyzeDishCost(dish4.costInCents);
//        DishTools.flipRecommendation(dish3.wouldRecommend);
    }
}