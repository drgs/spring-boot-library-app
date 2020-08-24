package com.philips.sonarbot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
	
	@Autowired
	LibraryService libraryService;
	
	@GetMapping("/")
	public String displayHelloMessage() {
		return "Hello";
	}
	
	@GetMapping("/add/{bookName}")
	public String addBook(@PathVariable("bookName") String bookName) {
		return libraryService.addBook(bookName);
	}
	
	@GetMapping("/get/books")
	public List<String> getAllBooks() {
		return libraryService.getAllBooks();
	}
	
}
