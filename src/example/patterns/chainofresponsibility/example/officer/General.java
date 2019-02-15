package example.patterns.chainofresponsibility.example.officer;

import example.patterns.chainofresponsibility.example.message.Message;

public class General extends Officer {

    private static final int CODE = 30;
    private static final String NAME = "General von Klinkerhoffen";

    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.GENERAL) &&
                message.getCode() == CODE){
            System.out.println(NAME + " received the message: " + message.getContent());
        }else {
            System.out.println("Bad message recipient or bad security code");
        }
    }
}
