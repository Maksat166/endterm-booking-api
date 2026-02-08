package kz.aitu.endtermbookingapi.controller;

import kz.aitu.endtermbookingapi.model.Booking;
import kz.aitu.endtermbookingapi.service.BookingService;
import kz.aitu.endtermbookingapi.dto.BookingRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public Booking create(@RequestBody BookingRequest request) {
        return bookingService.createBooking(request);
    }

    @GetMapping
    public List<Booking> getAll() {
        return bookingService.getAllBookings();
    }
}
