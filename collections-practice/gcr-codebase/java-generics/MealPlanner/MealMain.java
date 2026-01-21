package BridgeLabz_Day29_Generics.MealPlanner;

public class MealMain {
    public static void main(String[] args) {
        Meal<VegetarianMeal> m1 = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> m2 = new Meal<>(new VeganMeal());
        m1.serve();
        m2.serve();
    }
}