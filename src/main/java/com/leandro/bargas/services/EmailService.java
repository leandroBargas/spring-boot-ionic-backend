package com.leandro.bargas.services;

import org.springframework.mail.SimpleMailMessage;

import com.leandro.bargas.domain.Cliente;
import com.leandro.bargas.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
