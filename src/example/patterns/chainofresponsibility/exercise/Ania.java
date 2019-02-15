package example.patterns.chainofresponsibility.exercise;

public class Ania extends Child {

    private static final String NAME = "Ania";

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println(NAME + " reached the jar and took it!");
        }else {
            this.getTallerChild().processRequest(motherRequest);
        }
    }
}
