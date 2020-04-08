package org.estudo.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.estudo.model.User;
import org.estudo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class PersistirUsuarioDelegate implements JavaDelegate {

	@Autowired
	private UserService userService;
	

	public void execute(DelegateExecution execution) {
		User user = new User();
		
		user.setNome("nome");
		user.setEmail("email");
		user.setPassword("fewfe");
		
		userService.save(user);
	}

}