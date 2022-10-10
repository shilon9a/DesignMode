package Builder;

import Builder.item.Bugger.impl.BuggerOne;
import Builder.item.Bugger.impl.BuggerTwo;
import Builder.item.Drink.impl.Coke;
import Builder.item.Drink.impl.Peisi;

/**
 * 在这里可以创建不同的item组合，然后使用Meal来封装，因为Meal维护着一个ItemList
 */
public class MealBuilder {

    /**
     * 套餐一：BuggerOne + Coke
     * @return
     */
    public Meal getSetMealOne(){
        Meal meal=new Meal();
        meal.addItem(new BuggerOne());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 套餐二：BuggerOne + Peisi
     * @return
     */
    public Meal getSetMealTwo(){
        Meal meal=new Meal();
        meal.addItem(new BuggerOne());
        meal.addItem(new Peisi());
        return meal;
    }

    /**
     * 套餐三：BuggerTwo + Coke
     * @return
     */
    public Meal getSetMealThree(){
        Meal meal=new Meal();
        meal.addItem(new BuggerTwo());
        meal.addItem(new Coke());
        return meal;
    }
}
