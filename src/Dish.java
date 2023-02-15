public class Dish {
    private String nameOfDish;
    private int costInCents;
    private boolean wouldRecommend;
public void makeDish(String nameOfDish, int costInCents, boolean wouldRecommend) {
    this.nameOfDish = nameOfDish;
    this.costInCents = costInCents;
    this.wouldRecommend = wouldRecommend;
}
   public void printSummary(){
   System.out.printf("Name: %s\nCost: %s\nRecommended: %s\n|================|\n",nameOfDish,costInCents,wouldRecommend);
}
    public void main(String[] args) {

    }
}
