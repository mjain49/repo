package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Greet")
public class Greet {
	@Id
	@Column(name="MessageID",length=5)
	@GeneratedValue(strategy=GenerationType.AUTO) // AUTO starts from a random point and increment it by 1 for the next id's
	private int messageId;
	@Column(name="Message",length=50)
	private String message;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
