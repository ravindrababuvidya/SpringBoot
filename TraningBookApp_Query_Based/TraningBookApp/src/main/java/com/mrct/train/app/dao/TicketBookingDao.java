package com.mrct.train.app.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mrct.train.app.model.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {
	
	

}
