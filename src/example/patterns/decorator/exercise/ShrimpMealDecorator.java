package example.patterns.decorator.exercise;

public class ShrimpMealDecorator extends MealDecorator {

    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    private void addShrimp(){
        System.out.println("Adding shrimp to the meal...");
    }

    @Override
    public void prepareMeal() {
        this.addShrimp();
        this.meal.prepareMeal();
    }
}
