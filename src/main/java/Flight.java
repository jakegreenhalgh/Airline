import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public int getAvailableSeats() {
        return this.plane.plane_type.getCapacity() - this.passengers.size();
    }

    public void bookPassenger(Passenger newPassenger) {
        if (this.plane.plane_type.getCapacity() > 0) {
        this.passengers.add(newPassenger);}
    }
}
