package example.patterns.decorator.exercise;

public class SauceMealDecorator extends MealDecorator{

    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    private void addSauce(){
        System.out.println("Adding sauce to the meal");
    }

    @Override
    public void prepareMeal() {
        this.addSauce();
        this.meal.prepareMeal();
    }
}
