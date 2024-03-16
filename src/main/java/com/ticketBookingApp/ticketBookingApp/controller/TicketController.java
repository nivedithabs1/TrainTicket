package com.ticketBookingApp.ticketBookingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ticketBookingApp.ticketBookingApp.model.Ticket;
import com.ticketBookingApp.ticketBookingApp.service.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/purchase")
    public Ticket purchaseTicket(@RequestBody Ticket ticket) {
        return ticketService.purchaseTicket(ticket);
    }

    @GetMapping("/section/{section}")
    public List<Ticket> getTicketsBySection(@PathVariable String section) {
        return ticketService.getTicketsBySection(section);
    }

    @DeleteMapping("/{ticketId}")
    public void removeTicket(@PathVariable Long ticketId) {
        ticketService.removeTicket(ticketId);
    }

    @PutMapping("/{ticketId}/modify-seat")
    public Ticket modifySeat(@PathVariable Long ticketId, @RequestParam String newSeatNumber) {
        return ticketService.modifySeat(ticketId, newSeatNumber);
    }
}
