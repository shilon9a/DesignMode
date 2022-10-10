package Builder;

import Builder.item.Bugger.impl.BuggerTwo;

public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder=new MealBuilder();
        Meal one = mealBuilder.getSetMealOne();
        one.showItems();
        System.out.println("------------------");
        one.addItem(new BuggerTwo());
        one.showItems();
    }
}
