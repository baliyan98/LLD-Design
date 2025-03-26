package parking.lot.lld;

import java.util.UUID;

public class ParkingSpot {

    boolean isAvailable;
    String spotNo;
    VehicleType type;

    public ParkingSpot(VehicleType type){
        this.spotNo = UUID.randomUUID().toString();
        this.isAvailable = true;
        this.type = type;
    }

    public void parkVehicle(){
        this.isAvailable =  false;
    }

    public void removeVehicle(){
        this.isAvailable = true;
    }
}
