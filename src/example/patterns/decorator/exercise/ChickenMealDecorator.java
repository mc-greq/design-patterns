package example.patterns.decorator.exercise;

public class ChickenMealDecorator extends MealDecorator{

    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    private void addChicken(){
        System.out.println("Adding chicken to the meal...");
    }

    @Override
    public void prepareMeal() {
        this.addChicken();
        this.meal.prepareMeal();
    }
}
