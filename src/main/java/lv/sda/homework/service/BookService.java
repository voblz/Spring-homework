package lv.sda.homework.service;


import lv.sda.homework.model.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public Book createBook(String author, int issueDate, int isbn){
        Book book = new Book();
        book.setAuthor(author);
        book.setIssueDate(issueDate);
        book.setIsbn(isbn);
        return book;
    }


}
