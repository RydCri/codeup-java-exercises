public class Dish {
    public String nameOfDish;
    public int costInCents;
    public boolean wouldRecommend;

   public void printSummary(){
   System.out.printf("Cost: %s\n Name: %s\n Recommended: %s\n",costInCents,nameOfDish,wouldRecommend);
}
    public void main(String[] args) {

    }
}
