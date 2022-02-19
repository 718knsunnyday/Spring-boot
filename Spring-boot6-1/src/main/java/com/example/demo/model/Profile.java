package com.example.demo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profile {
	@NotBlank
	@Size(max=30)
	private String name;
	
	@NotBlank
	@Min(20)
	private int age;
	
	@NotBlank
	@Max(50)
	private String livingPlace;
	
	@NotBlank
	@Max(100)
	private String hobby;
	
	@Max(500)
	private String Introduction;
}
