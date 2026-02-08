package kz.aitu.endtermbookingapi.service;

import kz.aitu.endtermbookingapi.dto.BookingRequest;
import kz.aitu.endtermbookingapi.model.Booking;
import kz.aitu.endtermbookingapi.patterns.builder.FlightBookingBuilder;
import kz.aitu.endtermbookingapi.patterns.builder.HotelBookingBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {

    private final List<Booking> bookings = new ArrayList<>();

    public Booking createBooking(BookingRequest req) {
        Booking booking;

        if ("flight".equalsIgnoreCase(req.getType())) {
            booking = new FlightBookingBuilder()
                    .setCustomerName(req.getCustomerName())
                    .setStartDate(req.getStartDate())
                    .setEndDate(req.getEndDate())
                    .setPrice(req.getPrice())
                    .build();

        } else if ("hotel".equalsIgnoreCase(req.getType())) {
            booking = new HotelBookingBuilder()
                    .setCustomerName(req.getCustomerName())
                    .setStartDate(req.getStartDate())
                    .setEndDate(req.getEndDate())
                    .setPrice(req.getPrice())
                    .setHotelName(req.getHotelName())
                    .setRoomType(req.getRoomType())
                    .build();

        } else {
            throw new IllegalArgumentException("Unknown type: " + req.getType());
        }

        bookings.add(booking);
        return booking;
    }

    public List<Booking> getAllBookings() {
        return bookings;
    }
}

