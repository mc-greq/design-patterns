package example.patterns.visitor.example.visitor;

import example.patterns.visitor.example.activity.Squash;
import example.patterns.visitor.example.activity.Treadmill;
import example.patterns.visitor.example.activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);
    void visit(Weights weights);
    void visit(Squash squash);
}
