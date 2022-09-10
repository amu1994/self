package com.example.demo.module;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "girl_table")
public class Girl {
	@Id
	private Integer id;
	private String name;
	private String location;
	private Integer age;
	

}
