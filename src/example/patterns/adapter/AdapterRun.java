package example.patterns.adapter;

import example.patterns.adapter.sockets.*;

public class AdapterRun {

    public static void main(String[] args) {

        ContinentalDevice radio = () -> System.out.println("Play music");
        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);

        UKDevice ukDevice = () -> System.out.println("Play english music");
        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(ukDevice);

        UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukDevice);
        continentalSocket.plugIn(adapter);

        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(ukDevice, radio);
        continentalSocket.plugIn(twoWayAdapter);
        ukSocket.plugIn(twoWayAdapter);

    }
}
