package kz.aitu.endtermbookingapi.patterns.factory;

import kz.aitu.endtermbookingapi.model.Booking;
import kz.aitu.endtermbookingapi.model.FlightBooking;
import kz.aitu.endtermbookingapi.model.HotelBooking;

import java.time.LocalDate;
import java.util.Map;

public class BookingFactory {

    public static Booking createBooking(String type, Map<String, Object> data) {

        if ("HOTEL".equalsIgnoreCase(type)) {
            return new HotelBooking(
                    null,
                    (String) data.get("customerName"),
                    (LocalDate) data.get("startDate"),
                    (LocalDate) data.get("endDate"),
                    (double) data.get("price"),
                    (String) data.get("hotelName"),
                    (String) data.get("roomType")
            );
        }

        if ("FLIGHT".equalsIgnoreCase(type)) {
            return new FlightBooking(
                    null,
                    (String) data.get("customerName"),
                    (LocalDate) data.get("startDate"),
                    (LocalDate) data.get("endDate"),
                    (double) data.get("price"),
                    (String) data.get("flightNumber"),
                    (String) data.get("fromCity"),
                    (String) data.get("toCity")
            );
        }

        throw new IllegalArgumentException("Unknown booking type: " + type);
    }
}
