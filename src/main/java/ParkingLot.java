public class ParkingLot {
    private String parkingLotName;

    private int original_capacity=10;

    private int capacity = 10;

    ParkingLot(String name){
        this.parkingLotName = name;
    }

    ParkingLot(String name,Integer capacity){
        this.parkingLotName = name;
        this.capacity=capacity;
        this.original_capacity=capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public int getOriginal_capacity() {
        return original_capacity;
    }
    public void setOriginal_capacity(int capacity) {
        this.original_capacity = capacity;
    }
}
