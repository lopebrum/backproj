package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example" )
public class ProjectConfig {

    @Bean
    public Destination parisDestination() {
        return new Destination("Paris", 500.0);
    }

    @Bean
    public Booking AliceBooking(Destination destination) {
        return new Booking("Alice", destination);
    }

}
