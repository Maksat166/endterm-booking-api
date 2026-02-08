package kz.aitu.endtermbookingapi.patterns.builder;

import kz.aitu.endtermbookingapi.model.Booking;
import kz.aitu.endtermbookingapi.model.HotelBooking;
import java.time.LocalDate;

public class HotelBookingBuilder implements BookingBuilder {

    private String customerName;
    private String startDate;
    private String endDate;
    private double price;

    private String hotelName;
    private String roomType;

    @Override
    public BookingBuilder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    @Override
    public BookingBuilder setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public BookingBuilder setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    @Override
    public BookingBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public BookingBuilder setHotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }

    @Override
    public BookingBuilder setRoomType(String roomType) {
        this.roomType = roomType;
        return this;
    }

    @Override
    public Booking build() {
        return new HotelBooking(
                null,
                customerName,
                LocalDate.parse(startDate),
                LocalDate.parse(endDate),
                price,
                hotelName,
                roomType
        );
    }

}
