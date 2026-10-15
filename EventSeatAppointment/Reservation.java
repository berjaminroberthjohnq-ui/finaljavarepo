public class Reservation {
    private int reservationId;
    private String customerName;
    private Event event;
    private Seat seat;

    public Reservation(int reservationId,
                       String customerName,
                       Event event,
                       Seat seat) {

        this.reservationId = reservationId;
        this.customerName = customerName;
        this.event = event;
        this.seat = seat;
    }

    public int getReservationId() {
        return reservationId;
    }

    public Seat getSeat() {
        return seat;
    }

    @Override
    public String toString() {
        return "Reservation ID: " + reservationId +
                "\nCustomer: " + customerName +
                "\nEvent: " + event.getEventName() +
                "\nSeat Number: " + seat.getSeatNumber();
    }
}