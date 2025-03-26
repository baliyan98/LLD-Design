package parking.lot.lld;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

        ParkingSpot spot1 = new ParkingSpot(VehicleType.CAR);
        ParkingSpot spot2 = new ParkingSpot(VehicleType.BIKE);
        ParkingFloor floor = new ParkingFloor(1 , List.of(spot1 , spot2));

        // creating parking lot

        ParkingLot lot = new ParkingLot(List.of(floor), 10);

        Vehicle bike = new Vehicle("UP12BN2308" , VehicleType.BIKE);

        Ticket ticket = lot.issueTicket(bike);

        System.out.println("Ticket issued: " + ticket.ticketNo);

        boolean paymentStatus = lot.processPayment(ticket , PaymentMode.CreditCard);

        System.out.println("Payment success: "+ paymentStatus);


    }
}
