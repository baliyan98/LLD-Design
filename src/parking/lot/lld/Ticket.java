package parking.lot.lld;

import java.util.Date;
import java.util.UUID;

public class Ticket {
    String ticketNo;
    Vehicle vehicle;
    Date entryTime;

    public Ticket(Vehicle vehicle){
        this.entryTime = new Date();
        this.ticketNo = UUID.randomUUID().toString();
        this.vehicle = vehicle;
    }

    public double getPayment(){
        long duration = (new Date().getTime() - entryTime.getTime());
        return duration * 20;
    }
}
