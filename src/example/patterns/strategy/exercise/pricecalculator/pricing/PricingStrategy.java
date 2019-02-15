package example.patterns.strategy.exercise.pricecalculator.pricing;

public interface PricingStrategy {

    void calculatePrice(int price, boolean isSignedUpForNewsLetter);
}
