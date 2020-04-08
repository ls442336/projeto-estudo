package org.estudo.repository;

import org.estudo.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;

@Qualifier("app_db")
public interface UserRepository extends CrudRepository<User, Long> {
	
}
