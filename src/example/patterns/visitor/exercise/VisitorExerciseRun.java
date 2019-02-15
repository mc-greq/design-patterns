package example.patterns.visitor.exercise;

import example.patterns.visitor.exercise.shipment.Animal;
import example.patterns.visitor.exercise.shipment.Person;
import example.patterns.visitor.exercise.shipment.Shipment;
import example.patterns.visitor.exercise.shipment.Transportable;
import example.patterns.visitor.exercise.visitor.NameTransportVisitor;
import example.patterns.visitor.exercise.visitor.PriceTransportVisitor;
import example.patterns.visitor.exercise.visitor.TransportVisitor;

import java.util.Arrays;
import java.util.List;

public class VisitorExerciseRun {

    public static void main(String[] args) {
        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        TransportVisitor nameTransportVisitor = new NameTransportVisitor();
        TransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        transportableList.forEach(transportable -> transportable.accept(nameTransportVisitor));
        System.out.println("-----------------------------");
        transportableList.forEach(transportable -> transportable.accept(priceTransportVisitor));
    }
}
