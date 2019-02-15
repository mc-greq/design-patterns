package example.patterns.visitor.example.visitor;

import example.patterns.visitor.example.activity.Squash;
import example.patterns.visitor.example.activity.Treadmill;
import example.patterns.visitor.example.activity.Weights;

public class VisitorImpl implements Visitor{

    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Calories burned running the treadmill: "
                + treadmill.getDistance() * 20);
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories burned lifting weights: "
                + (weights.getReps() + weights.getWeight()) * 3);
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories burned playing squas: "
                + squash.getMinutesPlayed() * 20);
    }
}
