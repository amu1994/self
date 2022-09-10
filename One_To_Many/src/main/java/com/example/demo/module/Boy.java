package com.example.demo.module;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "boy_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Boy {
	@Id
	private Integer id;
	private String name;
	private String location;
	private Integer age;
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "bidfk")
	
	private List<Girl> girl;

}
