package BridgeLabz_Day29_Generics.MealPlanner;

interface MealPlan {
    void show();
}
class VegetarianMeal implements MealPlan {
    public void show() {
        System.out.println("Vegetarian Meal");
    }
}
class VeganMeal implements MealPlan {
    public void show() {
        System.out.println("Vegan Meal");
    }
}
class Meal<T extends MealPlan> {
    T meal;
    Meal(T meal) {
        this.meal = meal;
    }
    void serve() {
        meal.show();
    }
}