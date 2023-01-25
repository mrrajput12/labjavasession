/*
 * @project on springboot
 * service Interface
 * @author :Abhishek Raj
 * @date:25 jan 2023
 */
package om.labtest.BookDetail.Service;

import java.awt.print.Book;
import java.util.List;

import com.labtest.BookDetail.entity.BookDetailEntity;

public interface BookDetailService {
//creating different method
	BookDetailEntity updateEntity(BookDetailEntity bde, int id);

	List<Book> getalldata();

	BookDetailEntity insert(BookDetailEntity bde);

	String deleteEntity(int id);

	BookDetailEntity insertBookDetailEntity(BookDetailEntity bde);

	Book getEntity(int id);
}
