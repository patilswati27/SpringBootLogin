package com.bridgelabz.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document(collection = "Users")
public class User {
	@Id
	private String id;
	@Field
	private String username;
	@Field
	private String password;
}
