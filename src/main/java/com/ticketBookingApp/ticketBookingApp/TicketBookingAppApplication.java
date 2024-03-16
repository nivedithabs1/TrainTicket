package com.ticketBookingApp.ticketBookingApp;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ticketBookingApp.ticketBookingApp"})
@EntityScan("com.ticketBookingApp.ticketBookingApp.model")
public class TicketBookingAppApplication {

	public static void main(String[] args) {
		System.out.print("here i am");
		SpringApplication.run(TicketBookingAppApplication.class, args);
	}

}
