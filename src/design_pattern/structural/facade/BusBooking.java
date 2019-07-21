package design_pattern.structural.facade;

public class BusBooking implements BookingInterface {
    @Override
    public void book(BookingInfo info) {
        System.out.println("Bus booked");
    }
}