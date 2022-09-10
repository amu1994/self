package com.app.module;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "vendor_table")
@AllArgsConstructor
@NoArgsConstructor
public class Vendor {
	@Id
	private Integer id;
	private String vname;
	private String vlocation;

}
