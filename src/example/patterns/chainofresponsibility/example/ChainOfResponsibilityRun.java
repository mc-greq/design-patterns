package example.patterns.chainofresponsibility.example;

import example.patterns.chainofresponsibility.example.message.Message;
import example.patterns.chainofresponsibility.example.officer.*;

public class ChainOfResponsibilityRun {

    public static void main(String[] args) {
        Message captainMessage = new Message("Attack", 20, OfficerRank.CAPTAIN);
        Message generalMessage = new Message("Defend!", 50, OfficerRank.GENERAL);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(captainMessage);
        sergeant.processMessage(generalMessage);

    }
}
