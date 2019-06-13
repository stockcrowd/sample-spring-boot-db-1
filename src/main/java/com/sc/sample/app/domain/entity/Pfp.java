package com.sc.sample.app.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pfp {
	
	@Id
	@GeneratedValue
	private Long id;
	
    String name;
    Integer registerNumber;
    String registerDate;
    String webpage;
}
