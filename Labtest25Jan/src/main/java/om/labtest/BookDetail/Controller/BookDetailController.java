/*
 * @project on springboot
 * controller class
 * @author :Abhishek Raj
 * @date:25 jan 2023
 */

package om.labtest.BookDetail.Controller;

import java.awt.print.Book;
//importing
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.labtest.BookDetail.entity.BookDetailEntity;

import om.labtest.BookDetail.Service.BookDetailService;

@RestController
public class BookDetailController {

	@Autowired
	BookDetailService bds;

//mapping used
	// to view the detail
	@GetMapping("/show")
	public List<Book> view() {
		return bds.getalldata();
	}

//to add the detail
	@PostMapping(value = "/add")
	public BookDetailEntity add(@RequestBody BookDetailEntity bde) {
		return bds.insert(bde);

	}

//to update the detail
	@PutMapping(value = "/update/{id}")
	public BookDetailEntity add(@RequestBody int id, @RequestBody BookDetailEntity bde) {
		return bds.updateEntity(bde, id);

	}

//to delete the detil
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return bds.deleteEntity(id);

	}

}
