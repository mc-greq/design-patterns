package example.patterns.visitor.exercise.shipment;

import example.patterns.visitor.exercise.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);
}
