package com.boutique.Management;

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
@Table(name = "Products")
public class Product {
	@Id
	private int pro_id;
	private String Pro_name;
	private String Pro_size;
	private float Pro_Amt;
	private String Pro_Cat;

}
