import java.util.ArrayList;

public class SmartParkingBoy extends ParkingBoy{
    private String boyName;
    private ArrayList<ParkingLot> parkingLots;
    ParkingService parkingService = new ParkingService();

    SmartParkingBoy(String boyName, ArrayList<ParkingLot> parkingLots) {
        this.boyName = boyName;
        this.parkingLots = parkingLots;
    }

    public Message manualParkCarSmart(Car car) {
        ParkingLot targetParkingLot = parkingLots.get(0);
        for (ParkingLot parkinglot : parkingLots) {
            if (parkinglot.getCapacity() > targetParkingLot.getCapacity())
                targetParkingLot = parkinglot;
        }
        return parkingService.parkCar(targetParkingLot, car);
    }
}
