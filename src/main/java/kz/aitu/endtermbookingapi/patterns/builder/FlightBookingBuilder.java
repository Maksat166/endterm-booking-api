package kz.aitu.endtermbookingapi.patterns.builder;

import kz.aitu.endtermbookingapi.model.Booking;
import kz.aitu.endtermbookingapi.model.FlightBooking;

import java.time.LocalDate;

public class FlightBookingBuilder implements BookingBuilder {

    private String customerName;
    private LocalDate startDate;
    private LocalDate endDate;
    private double price;

    @Override
    public BookingBuilder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    @Override
    public BookingBuilder setStartDate(String startDate) {
        this.startDate = LocalDate.parse(startDate);
        return this;
    }

    @Override
    public BookingBuilder setEndDate(String endDate) {
        this.endDate = LocalDate.parse(endDate);
        return this;
    }

    @Override
    public BookingBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public Booking build() {
        return new FlightBooking(
                null,
                customerName,
                startDate,
                endDate,
                price,
                null,
                null,
                null
        );
    }
    @Override
    public BookingBuilder setHotelName(String hotelName) {
        return this;
    }

    @Override
    public BookingBuilder setRoomType(String roomType) {
        return this;
    }

}
