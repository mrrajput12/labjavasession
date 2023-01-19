package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DetailsBook")
public class Student {
	@Id
	private int Stud_id;
	private String Stud_name;
	private int Stud_rollno;
	private int Stud_class;
	private String Stud_addno;

	@ManyToMany
	private Student identity;

}
