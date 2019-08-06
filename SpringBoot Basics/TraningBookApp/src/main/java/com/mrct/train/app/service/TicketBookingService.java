package com.mrct.train.app.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mrct.train.app.dao.TicketBookingDao;
import com.mrct.train.app.model.Ticket;

@Service
public class TicketBookingService {
	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketBookingDao.save(ticket);
	}

	public Ticket getTicketDetails(Integer ticketId) {
		// TODO Auto-generated method stub
		return ticketBookingDao.findOne(ticketId);
	}

	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return (List<Ticket>) ticketBookingDao.findAll();
	}

	public Ticket updateTicketDetails(Integer ticketId, String email, String passengerName) {
		// TODO Auto-generated method stub
		Ticket ticket = ticketBookingDao.findOne(ticketId);
		if(email == null) {
			ticket.setEmail(ticket.getEmail());
		}else {
			ticket.setEmail(email);
		}
		if(passengerName == null) {
			ticket.setPassengerName(ticket.getPassengerName());
		}else {
			ticket.setPassengerName(passengerName);
		}
		
		
		System.out.println("Updated Ticket Details "+ticketId);
		return ticketBookingDao.save(ticket);
	}

	public void deletTicket(int ticketId) {
		// TODO Auto-generated method stub
		 ticketBookingDao.delete(ticketId);
		
	}
	
}
