package com.boutique.Management;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BillingRecord")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillingRecord {

	@Id
	private int id;
	private String Cust_name;
	private String Cust_mno;
	private int Quantity;
	private float Total_Amt;
	private int Pro_id;
}
