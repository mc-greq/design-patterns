package example.patterns.builder.exercise;

public class FlightLegRun {

    public static void main(String[] args) {
        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").price(50).build();

        System.out.println(leg);

        FlightLeg leg1 = new FlightLeg.FlightLegBuilder("Las Vegas","Los Angeles").build();
        System.out.println(leg1);
    }
}
