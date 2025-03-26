package parking.lot.lld;

import java.util.List;

public class ParkingFloor {
    List<ParkingSpot> spots;
    int floorNo;

    public ParkingFloor(int floorNo , List<ParkingSpot> spots){
        this.floorNo = floorNo;
        this.spots = spots;
    }

    public ParkingSpot findAvailableSpot(VehicleType type){
        for(ParkingSpot spot : spots){
            if ( spot.isAvailable && spot.type.equals(type)){
                return spot;
            }
        }
        return null;
    }
}
