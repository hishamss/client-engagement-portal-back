package com.engagement.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.engagement.model.Client;


/**
 * This is the repo interface for the Clients. 
 *  Methods like findAll, save, delete, etc are all provided by the JpaRepository hierarchy
 * @author enoch cho
 * 
 *
 */
@Repository
public interface ClientRepo extends JpaRepository<Client, Integer> {
	
	/**
	 * Returns the specific client with the matching id
	 * @param id
	 * The int id of the client 
	 * @return Returns a Client
	 * 
	 */
	Client findByClientId(int id);
}
