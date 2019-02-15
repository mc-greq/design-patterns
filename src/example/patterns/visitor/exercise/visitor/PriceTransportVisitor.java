package example.patterns.visitor.exercise.visitor;

import example.patterns.visitor.exercise.shipment.Animal;
import example.patterns.visitor.exercise.shipment.Person;
import example.patterns.visitor.exercise.shipment.Shipment;

public class PriceTransportVisitor implements TransportVisitor {

    @Override
    public void visit(Animal animal) {
        System.out.println("Animal transportation price: " + animal.getWeight()*0.2);
    }

    @Override
    public void visit(Person person) {
        int price = 6;
        if (person.isRegularCustomer()) {
            price = price / 2;
        }
        System.out.println("Price per kilometer for a person: "
                + price + " PLN");
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;
        if(shipment.isLarge()){
            price *= 3;
        }
        System.out.println("Shipment transportation price: " + price);
    }
}
