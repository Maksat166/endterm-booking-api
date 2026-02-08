package kz.aitu.endtermbookingapi.model;

import java.time.LocalDate;

public abstract class Booking {
    protected Long id;
    protected String type;          
    protected String customerName;
    protected LocalDate startDate;
    protected LocalDate endDate;
    protected double price;

    public Booking(String customerName, String date, double price, String details) {}

    public Booking(Long id, String type, String customerName,
                   LocalDate startDate, LocalDate endDate, double price) {
        this.id = id;
        this.type = type;
        this.customerName = customerName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract String getDetails();
}
