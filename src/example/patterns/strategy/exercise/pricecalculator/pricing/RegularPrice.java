package example.patterns.strategy.exercise.pricecalculator.pricing;

public class RegularPrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsLetter) {
        if(!isSignedUpForNewsLetter){
            System.out.println("Regular price: " + price);
        }else {
            System.out.println("Client is signed up for newsletter, choose different strategy!");
        }
    }
}
