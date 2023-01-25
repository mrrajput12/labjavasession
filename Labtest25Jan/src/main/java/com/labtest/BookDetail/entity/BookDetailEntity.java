/*
 * @project on springboot
 * pojo class 
 * @author :Abhishek Raj
 * @date:25 jan 2023
 */
package com.labtest.BookDetail.entity;

//importing
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
//table name
@Table(name = "BookDetail")
public class BookDetailEntity {
	// primary key
	@Id
	// fields
	private int Book_Id;
	private String Book_Title;
	private String Author;
	private int Page_no;
	private float Book_price;

	public BookDetailEntity save(BookDetailEntity bde) {
		// TODO Auto-generated method stub
		return null;
	}

}
