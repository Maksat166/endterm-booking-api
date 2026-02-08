package kz.aitu.endtermbookingapi.model;

import java.time.LocalDate;

public class FlightBooking extends Booking {

    private String flightNumber;
    private String fromCity;
    private String toCity;

    public FlightBooking() {
        super(null, null, 0.0, null);
        this.type = "FLIGHT";
    }

    public FlightBooking(Long id,
                         String customerName,
                         LocalDate startDate,
                         LocalDate endDate,
                         double price,
                         String flightNumber,
                         String fromCity,
                         String toCity) {

        super(id, "FLIGHT", customerName, startDate, endDate, price);
        this.flightNumber = flightNumber;
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    @Override
    public String getDetails() {
        return "Flight " + flightNumber + " from " + fromCity + " to " + toCity;
    }
}
