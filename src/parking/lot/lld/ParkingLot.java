package parking.lot.lld;

import java.util.List;

public class ParkingLot {
    List<ParkingFloor> floors;
    int parkingRate;

    public ParkingLot(List<ParkingFloor> floors , int parkingRate){
        this.parkingRate = parkingRate;
        this.floors = floors;
    }

    public Ticket issueTicket(Vehicle vehicle){
        for(ParkingFloor floor: floors){
            ParkingSpot spot = floor.findAvailableSpot(vehicle.type);
            if ( spot != null){
                return new Ticket(vehicle);
            }
        }
        return null;
    }
    public boolean processPayment(Ticket ticket , PaymentMode type){
        double fare = ticket.getPayment();
        Payment payment = new Payment(fare , type);
        return payment.processPayment();
    }

}
