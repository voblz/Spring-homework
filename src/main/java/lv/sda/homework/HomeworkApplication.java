package lv.sda.homework;

import lv.sda.homework.model.Book;
import lv.sda.homework.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(HomeworkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book = bookService.createBook("Tofik", 1998, 123456798);
		System.out.println(book.getAuthor() + " " + book.getIssueDate()+ " " + book.getIsbn());
	}
}
