package model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
	@Id
	private int Book_id;
	private String Book_name;
	private float Book_price;
	private int Stud_id;
}
