package com.ticketBookingApp.ticketBookingApp.repository;

import com.ticketBookingApp.ticketBookingApp.model.Ticket;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
	 List<Ticket> findBySection(String section);
}
