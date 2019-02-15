package example.patterns.visitor.exercise.visitor;

import example.patterns.visitor.exercise.shipment.Animal;
import example.patterns.visitor.exercise.shipment.Person;
import example.patterns.visitor.exercise.shipment.Shipment;

public class NameTransportVisitor implements TransportVisitor{

    @Override
    public void visit(Animal animal) {
        System.out.println("Animal type: " + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Name: " + person.getFirstName()
                + ", Last name: " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Shipment prefix: " + shipment.getPrefix()
                + ", serial nr: " + shipment.getSerialNumber());
    }
}
