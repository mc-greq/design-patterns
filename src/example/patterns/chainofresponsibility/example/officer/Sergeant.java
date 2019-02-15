package example.patterns.chainofresponsibility.example.officer;

import example.patterns.chainofresponsibility.example.message.Message;

public class Sergeant extends Officer{

    private static final int CODE = 10;
    private static final String NAME = "Sergeant Kowalski";

    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.SERGEANT) &&
                message.getCode() == CODE){
            System.out.println(NAME + " received the message: " + message.getContent());
        }else {
            this.getSuperiorOfficer().processMessage(message);
        }
    }
}
