import java.util.ArrayList;
import java.util.Objects;

public class ParkingBoy {
    private String boyName;
    private ArrayList<ParkingLot> parkingLots;
    ParkingService parkingService = new ParkingService();

    ParkingBoy(String boyName, ArrayList<ParkingLot> parkingLots) {
        this.boyName = boyName;
        this.parkingLots = parkingLots;
    }

    public ParkingBoy() {//没这个不能拓展
    }


    public Message manualParkCar(Car car) {
        ParkingLot targetParkingLot = parkingLots.get(0);
        return parkingService.parkCar(targetParkingLot, car);
    }

    public Message manualFetchCar(Ticket ticket) {
        String parkingLotName = ticket.getParkingLotName();
        ParkingLot targetParkingLot = null;
        for (ParkingLot parkinglot : parkingLots) {
            if (Objects.equals(parkinglot.getParkingLotName(), parkingLotName))
                targetParkingLot = parkinglot;
        }
        return parkingService.fetchCar(targetParkingLot, ticket);
    }

}

