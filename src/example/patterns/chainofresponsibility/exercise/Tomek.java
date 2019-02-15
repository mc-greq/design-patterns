package example.patterns.chainofresponsibility.exercise;

public class Tomek extends Child{

    private static final String NAME = "Tomek";

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.MEDIUM)){
            System.out.println(NAME + " reached the jar and took it!");
        }else {
            this.getTallerChild().processRequest(motherRequest);
        }
    }
}
