package example.patterns.visitor.exercise.visitor;

import example.patterns.visitor.exercise.shipment.Animal;
import example.patterns.visitor.exercise.shipment.Person;
import example.patterns.visitor.exercise.shipment.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);
}
