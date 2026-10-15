public class Seat {
    private int seatNumber;
    private boolean reserved;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.reserved = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void reserve() {
        reserved = true;
    }

    public void release() {
        reserved = false;
    }

    @Override
    public String toString() {
        return "Seat " + seatNumber +
               (reserved ? " [Reserved]" : " [Available]");
    }
}