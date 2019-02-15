package example.patterns.visitor.example;

import example.patterns.visitor.example.activity.Activity;
import example.patterns.visitor.example.activity.Squash;
import example.patterns.visitor.example.activity.Treadmill;
import example.patterns.visitor.example.activity.Weights;
import example.patterns.visitor.example.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class VisitorRun {

    public static void main(String[] args) {

        Activity treadmill = new Treadmill(200);
        Activity squash = new Squash(45);
        Activity weights = new Weights(50, 10);

        VisitorImpl visitorImpl = new VisitorImpl();

        treadmill.accept(visitorImpl);
        squash.accept(visitorImpl);
        weights.accept(visitorImpl);

        System.out.println();
        List<Activity> activities = Arrays.asList(treadmill, squash, weights);
        activities.forEach(activity -> activity.accept(visitorImpl));


    }

}
