package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Destination destination = context.getBean(Destination.class);
        Booking booking = context.getBean(Booking.class);

        System.out.println("Destination: " + destination.getName());
        System.out.println("Booking: " + booking.getCustomerName() + " booked " + booking.getDestination().getName());
    }
}