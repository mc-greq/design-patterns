package example.patterns.chainofresponsibility.example.officer;

import example.patterns.chainofresponsibility.example.message.Message;

public class Captain extends Officer {

    private static final int CODE = 20;
    private static final String NAME = "Captain Miller";


    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.CAPTAIN) &&
                message.getCode() == 20){
            System.out.println(NAME + " received the message: " + message.getContent());
        }else {
            this.getSuperiorOfficer().processMessage(message);
        }
    }
}
