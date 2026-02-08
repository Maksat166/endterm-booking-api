package kz.aitu.endtermbookingapi.model;

import java.time.LocalDate;

public class HotelBooking extends Booking {

    private String hotelName;
    private String roomType;

    public HotelBooking() {
        super(null, null, 0.0, null);
        this.type = "HOTEL";
    }


    public HotelBooking(Long id,
                        String customerName,
                        LocalDate startDate,
                        LocalDate endDate,
                        double price,
                        String hotelName,
                        String roomType) {

        super(id, "HOTEL", customerName, startDate, endDate, price);
        this.hotelName = hotelName;
        this.roomType = roomType;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String getDetails() {
        return "Hotel: " + hotelName + ", Room: " + roomType;
    }
}
