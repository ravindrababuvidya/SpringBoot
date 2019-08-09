package com.mrct.train.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mrct.train.app.model.Ticket;
@Repository
public interface MyTicketRepositoryDao extends JpaRepository<Ticket, Integer> {
	@Query(value = "select t from Ticket t where t.email like ?1%")
	 Ticket getTicketByEmail(String email);
	@Query(value = "select t from Ticket t where t.passengerName = ?1")
	Ticket getTicketByPassengerName(String passengerName);
}
