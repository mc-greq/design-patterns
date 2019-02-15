package example.patterns.visitor.example.activity;

import example.patterns.visitor.example.visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);
}
