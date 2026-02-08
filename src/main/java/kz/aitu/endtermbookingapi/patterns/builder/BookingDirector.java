package kz.aitu.endtermbookingapi.patterns.builder;

import kz.aitu.endtermbookingapi.model.Booking;

public class BookingDirector {

    public Booking buildBasicBooking(
            BookingBuilder builder,
            String customerName,
            String startDate,
            String endDate,
            double price
    ) {
        return builder
                .setCustomerName(customerName)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .setPrice(price)
                .build();
    }
}
