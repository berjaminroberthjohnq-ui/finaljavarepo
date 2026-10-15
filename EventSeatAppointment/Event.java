public class Event {
    private int eventId;
    private String eventName;
    private String eventDate;
    private int totalSeats;

    public Event(int eventId, String eventName, String eventDate, int totalSeats) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.totalSeats = totalSeats;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    @Override
    public String toString() {
        return "ID: " + eventId +
               " | Event: " + eventName +
               " | Date: " + eventDate +
               " | Seats: " + totalSeats;
    }
}