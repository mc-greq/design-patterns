package example.patterns.strategy.exercise.pricecalculator.pricing;

public class SalePrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsLetter) {
        if(isSignedUpForNewsLetter){
            System.out.println("Sale price: " + price/2);
        }else {
            System.out.println("Client not signed up for newsletter, choose different strategy!");
        }
    }
}
