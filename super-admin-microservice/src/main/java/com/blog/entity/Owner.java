package com.blog.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@ToString
@Document
public class Owner {

	@Id
	private String id;
	private String name;
	@Indexed(unique = true)
	private String email;
	@Indexed(unique = true)
	private String password;
	@Indexed(unique = true)
	private String mobileNo;
	private String role;
}
