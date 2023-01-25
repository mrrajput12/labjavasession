/*
 * @project on springboot
 * Repositry interface
 * @author :Abhishek Raj
 * @date:25 jan 2023
 */

package om.labtest.BookDetail.Repositry;

//importing
import java.awt.print.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.labtest.BookDetail.entity.BookDetailEntity;

@Repository
public interface BookDetailRepositry extends JpaRepository<Book, Integer> {

	BookDetailEntity saveAll(BookDetailEntity bde);

}
