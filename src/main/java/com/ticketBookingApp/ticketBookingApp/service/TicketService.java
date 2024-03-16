package com.ticketBookingApp.ticketBookingApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketBookingApp.ticketBookingApp.model.Ticket;
import com.ticketBookingApp.ticketBookingApp.repository.TicketRepository;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket purchaseTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public List<Ticket> getTicketsBySection(String section) {
        return ticketRepository.findBySection(section);
    }

    public void removeTicket(Long ticketId) {
        ticketRepository.deleteById(ticketId);
    }

    public Ticket modifySeat(Long ticketId, String newSeatNumber) {
        Optional<Ticket> optionalTicket = ticketRepository.findById(ticketId);
        if (optionalTicket.isPresent()) {
            Ticket ticket = optionalTicket.get();
            ticket.setSeatNumber(newSeatNumber);
            return ticketRepository.save(ticket);
        }
        return null;
    }
}