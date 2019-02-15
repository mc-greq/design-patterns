package example.patterns.chainofresponsibility.exercise;

public class Antek extends Child{

    private static final String NAME = "Antek";

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.HIGH)){
            System.out.println(NAME + " reached the jar and took it!");
        }else {
            System.out.println("Nobody is high enough to reach that jar!");
        }
    }
}
