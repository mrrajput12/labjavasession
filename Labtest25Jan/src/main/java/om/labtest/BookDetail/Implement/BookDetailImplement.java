/*
 * @project on springboot
 * implement class
 * @author :Abhishek Raj
 * @date:25 jan 2023
 */
package om.labtest.BookDetail.Implement;

import java.awt.print.Book;
import java.util.List;

//importing
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labtest.BookDetail.entity.BookDetailEntity;

import om.labtest.BookDetail.Repositry.BookDetailRepositry;
import om.labtest.BookDetail.Service.BookDetailService;

@Service
public abstract class BookDetailImplement implements BookDetailService {
	@Autowired
	private BookDetailRepositry bdr;

	@Override
	public List<Book> getalldata() {
		// TODO Auto-generated method stub
		return bdr.findAll();
	}

	public BookDetailEntity insertBookDetailEntity(BookDetailEntity bde) {
		return bdr.saveAll(bde);
	}

	public Book getEntity(int id) {
		// TODO Auto-generated method stub
		return bdr.findById(id).get();

	}

	@Override
	public BookDetailEntity updateEntity(BookDetailEntity se, int id) {
		// TODO Auto-generated method stub
		BookDetailEntity bde = (BookDetailEntity) bdr.findAll();
		bde.setBook_Id(bde.getBook_Id());
		bde.setBook_Title(bde.getBook_Title());
		bde.setAuthor(bde.getAuthor());
		bde.setPage_no(bde.getPage_no());
		bde.setBook_price(bde.getBook_price());
		return bdr.saveAll(bde);

	}

	@Override
	public String deleteEntity(int id) {
		// TODO Auto-generated method stub
		bdr.deleteById(id);
		return "ID: " + id + "is deleted...";
	}
}