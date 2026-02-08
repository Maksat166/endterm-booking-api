package kz.aitu.endtermbookingapi.patterns.builder;

import kz.aitu.endtermbookingapi.model.Booking;

public interface BookingBuilder {

    BookingBuilder setCustomerName(String customerName);

    BookingBuilder setStartDate(String startDate);

    BookingBuilder setEndDate(String endDate);

    BookingBuilder setPrice(double price);

    
    BookingBuilder setHotelName(String hotelName);

    BookingBuilder setRoomType(String roomType);

    Booking build();
}
