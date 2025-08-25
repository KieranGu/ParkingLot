import java.util.ArrayList;
import java.util.Objects;

public class SuperParkingBoy {
    private String boyName;
    private ArrayList<ParkingLot> parkingLots;
    ParkingService parkingService = new ParkingService();

    SuperParkingBoy(String boyName, ArrayList<ParkingLot> parkingLots) {
        this.boyName = boyName;
        this.parkingLots = parkingLots;
    }

    public Message manualParkCarSuper(Car car) {
        ParkingLot targetParkingLot = parkingLots.get(0);
        for (ParkingLot parkinglot : parkingLots) {
            if (parkinglot.getCapacity()/parkinglot.getOriginal_capacity()
                    > targetParkingLot.getCapacity()/targetParkingLot.getOriginal_capacity())
                targetParkingLot = parkinglot;
        }
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
