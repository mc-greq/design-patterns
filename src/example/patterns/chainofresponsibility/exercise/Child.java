package example.patterns.chainofresponsibility.exercise;

public abstract class Child {

    private Child tallerChild;

    abstract public void processRequest(MotherRequest motherRequest);

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }

    public Child getTallerChild() {
        return tallerChild;
    }
}
