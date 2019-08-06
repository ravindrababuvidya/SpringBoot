package com.mrct.train.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrct.train.app.model.Ticket;
import com.mrct.train.app.service.TicketBookingService;

@RestController
@RequestMapping("/api/tickets")
public class TicketBookingController {
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping("create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}
	
	@GetMapping(value="/ticket/{ticketId}")
	public Ticket getTicketDetails(@PathVariable("ticketId") Integer ticketId) {
		return ticketBookingService.getTicketDetails(ticketId);
	}
	
	@GetMapping(value = "all")
	public List<Ticket> getAllTickets(){
		return ticketBookingService.getAllTickets();
		
	}
	
	@PutMapping(value = { "update/ticketId/{ticketId}/email/{email}",
			"update/ticketId/{ticketId}/email/{email}/passengerName/{passengerName}" })
	public Ticket updateTicketDetails(@PathVariable(name = "ticketId", required = true) Integer ticketId,
			@PathVariable(name = "email", required = false) String email,
			@PathVariable(name = "passengerName", required = false) String passengerName) {
		
		return ticketBookingService.updateTicketDetails(ticketId, email, passengerName);
	}
	
	@DeleteMapping("delete/ticketId/{ticketId}")
	public String deletTicket(@PathVariable(name = "ticketId") int ticketId) {
		 ticketBookingService.deletTicket(ticketId);
		 return "Sucessfully Record Deleted";
	}
}
