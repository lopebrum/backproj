package org.example;

public class Booking {
    private String customerName;
    private Destination destination;

    public Booking() {
    }

    public Booking(String customerName, Destination destination) {
        this.customerName = customerName;
        this.destination = destination;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
}
