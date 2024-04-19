// 20220418
package book;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import book.file.BookFileReader;

class BookTest {
	
	// lists to store lines from different loaded book files
	List<String> catInTheHat;
	List<String> warAndPeace;
	List<String> siddhartha;
	
	// book objects to be created from lines 
	Book catInTheHatBook;
	Book warAndPeaceBook;
	Book siddharthaBook;
		
	@BeforeEach
	void setUp() throws Exception {
		
		////////////////////////////////////////////////
		///// DO NOT MODIFY THE TEST CODE BELOW! ///////
		
		//load and parse cat in the hat snippet book file
		this.catInTheHat = BookFileReader.parseFile("the_cat_in_the_hat_snippet.txt");
		
		//create book object from list of lines from cat in the hat snippet
		this.catInTheHatBook = new Book(this.catInTheHat);
		
		//load and parse war and peace book file
		this.warAndPeace = BookFileReader.parseFile("war_and_peace.txt");
		
		//create book object from list of lines from war and peace
		this.warAndPeaceBook = new Book(this.warAndPeace);
		
		//load and parse siddhartha book file
		this.siddhartha = BookFileReader.parseFile("siddhartha.txt");
		
		//create book object from list of lines from siddhartha
		this.siddharthaBook = new Book(this.siddhartha);
		
		///// DO NOT MODIFY THE TEST CODE ABOVE! ///////
		////////////////////////////////////////////////
		
	}
	
	@Test
	void testBook() {
		
		////////////////////////////////////////////////
		///// DO NOT MODIFY THE TEST CODE BELOW! ///////
		
		//create empty list and book
		List<String> bookLines = new ArrayList<String>();
		Book book = new Book(bookLines);
		
		//confirm book lines is empty
		assertEquals(0, book.getLines().size(), "The number of book lines should be 0.");
		
		//create list with 2 lines and book
		String[] actualLinesArr = {"My book's first line.", "My book's second line."};
		bookLines = new ArrayList<String>(Arrays.asList(actualLinesArr));
		book = new Book(bookLines);
				
		//create array with 2 expected lines 
		String[] expectedLinesArr = {"My book's first line.", "My book's second line."};
		List<String> expectedLines = new ArrayList<String>(Arrays.asList(expectedLinesArr));
						
		//compare to 2 actual lines 
		assertEquals(expectedLines, book.getLines(), "The expected lines do not match the actual book lines.");
		
		//create array with first 3 expected lines of cat in the hat snippet
		String[] expectedLines1Array = {
			"Title: The Cat in the Hat",
			"Author: Dr. Seuss",
			"The sun did not shine."
		};
		List<String> expectedLines1 = new ArrayList<String>(Arrays.asList(expectedLines1Array));
				
		//compare to first 3 actual lines from cat in the hat
		assertEquals(expectedLines1, this.catInTheHatBook.getLines().subList(0, 3), "The expected 3 lines do not match the actual first 3 'The Cat in the Hat' book lines.");
		
		///// DO NOT MODIFY THE TEST CODE ABOVE! ///////
		////////////////////////////////////////////////
		
		
		// TODO insert 2 additional test cases
        // Hint(s): Get and compare the lines for war and peace and siddhartha book objects

		// Create a book with the first 17 lines of "War and Peace"
		List<String> warAndPeaceSnippet = this.warAndPeace.subList(0, 17);
		Book warAndPeaceSnippetBook = new Book(warAndPeaceSnippet);

		// Compare the first 17 lines of "War and Peace" with the lines of the book
		assertEquals(warAndPeaceSnippet, warAndPeaceSnippetBook.getLines(), "The expected lines do not match the actual book lines for 'War and Peace' snippet.");

		// Create a book with the first 17 lines of "Siddhartha"
		List<String> siddharthaSnippet = this.siddhartha.subList(0, 17);
		Book siddharthaSnippetBook = new Book(siddharthaSnippet);

		// Compare the first 3 lines of "Siddhartha" with the lines of the book
		assertEquals(siddharthaSnippet, siddharthaSnippetBook.getLines(), "The expected lines do not match the actual book lines for 'Siddhartha' snippet.");

	}

	@Test
	void testGetTitle() {
		
		////////////////////////////////////////////////
		///// DO NOT MODIFY THE TEST CODE BELOW! ///////
		
		//create list and book
		//with book title
		List<String> bookLines = new ArrayList<String>();
		bookLines.add("Title: Test Book Title");
		Book book = new Book(bookLines);
		
		//confirm book title
		assertEquals("Test Book Title", book.getTitle(), "The expected title does not match the actual book title.");
		
		//create list and book
		//with book title with whitespace before it
		bookLines = new ArrayList<String>();
		bookLines.add("Title:    A Different Book Title");
		book = new Book(bookLines);
		
		//confirm book title
		assertEquals("A Different Book Title", book.getTitle(), "The expected title does not match the actual book title.");
		
		//confirm book title for cat in the hat
		assertEquals("The Cat in the Hat", this.catInTheHatBook.getTitle(), "The expected title does not match the actual 'The Cat in the Hat' book title.");

		///// DO NOT MODIFY THE TEST CODE ABOVE! ///////
		////////////////////////////////////////////////

		
		// TODO insert 2 additional test cases
        // Hint(s): Confirm the book titles of war and peace and siddhartha book objects

		// Confirm the title of "The Cat in the Hat"
		assertEquals("The Cat in the Hat", this.catInTheHatBook.getTitle(), "The expected title does not match the actual title for 'The Cat in the Hat'.");

		// Confirm the title of a book with a long title
		List<String> longTitleBookLines = new ArrayList<String>();
		longTitleBookLines.add("Title: The Hitchhiker's Guide to the Galaxy");
		Book longTitleBook = new Book(longTitleBookLines);
		assertEquals("The Hitchhiker's Guide to the Galaxy", longTitleBook.getTitle(), "The expected title does not match the actual title for a book with a long title.");

	}

	@Test
	void testGetAuthor() {
		
		////////////////////////////////////////////////
		///// DO NOT MODIFY THE TEST CODE BELOW! ///////
		
		//create list and book
		//with book author
		List<String> bookLines = new ArrayList<String>();
		bookLines.add("Author: Joseph Berry");
		Book book = new Book(bookLines);
		
		//confirm book author
		assertEquals("Joseph Berry", book.getAuthor(), "The expected author does not match the actual book author.");
		
		//create list and book
		//with book author with whitespace before it
		bookLines = new ArrayList<String>();
		bookLines.add("Author:    Rhonda Fierri");
		book = new Book(bookLines);
		
		//confirm book author
		assertEquals("Rhonda Fierri", book.getAuthor(), "The expected author does not match the actual book author.");
		
		//confirm book author for cat in the hat
		assertEquals("Dr. Seuss", this.catInTheHatBook.getAuthor(), "The expected author does not match the actual 'The Cat in the Hat' book author.");
		
		///// DO NOT MODIFY THE TEST CODE ABOVE! ///////
		////////////////////////////////////////////////
		
		
		// TODO insert 2 additional test cases
        // Hint(s): Confirm the authors of war and peace and siddhartha book objects

		// Confirm the author of "The Cat in the Hat"
		assertEquals("Dr. Seuss", this.catInTheHatBook.getAuthor(), "The expected author does not match the actual author for 'The Cat in the Hat'.");

		// Confirm the author of a book with multiple translators
		List<String> multiTranslatorBookLines = new ArrayList<String>();
		multiTranslatorBookLines.add("Author: Fyodor Dostoevsky");
		multiTranslatorBookLines.add("Translator: Constance Garnett, Jessie Coulson");
		Book multiTranslatorBook = new Book(multiTranslatorBookLines);
		assertEquals("Fyodor Dostoevsky", multiTranslatorBook.getAuthor(), "The expected author does not match the actual author for a book with multiple translators.");

	}
	
	@Test
	void testGetTotalWordCount() {
		
		////////////////////////////////////////////////
		///// DO NOT MODIFY THE TEST CODE BELOW! ///////
		
		//create list and book
		List<String> bookLines = new ArrayList<String>();
		bookLines.add("one two three");
		Book book = new Book(bookLines);
		
		//confirm total word count
		assertEquals(3, book.getTotalWordCount(), "The total word count is incorrect. The expected answer is 3.");
		
		//create list and book
		bookLines = new ArrayList<String>();
		bookLines.add("one two three.  four five six.");
		book = new Book(bookLines);
		
		//confirm total word count
		assertEquals(6, book.getTotalWordCount(), "The total word count is incorrect. The expected answer is 6.");

		// create list and book
    	bookLines = new ArrayList<String>();
    	bookLines.add("*hello");
    	book = new Book(bookLines);

    	//confirm total word count
    	assertEquals(1, book.getTotalWordCount(), "The total word count is incorrect. The expected answer is 1.");
		
		//create list and book
		bookLines = new ArrayList<String>();
		bookLines.add("Title: My Book Title");
		bookLines.add("Author: My Book Author");
		bookLines.add("one, two, three.  four, five, six.");
		book = new Book(bookLines);
		
		//confirm total word count
		assertEquals(14, book.getTotalWordCount(), "The total word count is incorrect. The expected answer is 14.");
		
		//confirm approximate total word count for cat in the hat
		assertTrue(this.catInTheHatBook.getTotalWordCount() >= 100 && this.catInTheHatBook.getTotalWordCount() <= 120, "The approximate total word count for 'The Cat in the Hat' is incorrect. It should be greater than or equal to 100 and less than or equal to 120.");

		///// DO NOT MODIFY THE TEST CODE ABOVE! ///////
		////////////////////////////////////////////////

		
		// TODO insert 2 additional test cases
        // Hint(s): Create new books to add lines to and test the word count. You can create a smaller version of War and Peace and Siddhartha to test on.

		// Confirm the total word count for a book with one line containing numbers and symbols
		List<String> numbersAndSymbolsBookLines = new ArrayList<String>();
		numbersAndSymbolsBookLines.add("1. This line contains numbers (123) and symbols (&, $).");
		Book numbersAndSymbolsBook = new Book(numbersAndSymbolsBookLines);
		assertEquals(8, numbersAndSymbolsBook.getTotalWordCount(), "The total word count is incorrect for a book with numbers and symbols.");

		// Confirm the total word count for "Siddhartha" book
		assertEquals(42694, this.siddharthaBook.getTotalWordCount(), "The total word count for 'Siddhartha' is incorrect.");

	}

	@Test
	void testGetUniqueWordCount() {

		////////////////////////////////////////////////
		///// DO NOT MODIFY THE TEST CODE BELOW! ///////

		//create list and book
		List<String> bookLines = new ArrayList<String>();
		bookLines.add("one two three");
		Book book = new Book(bookLines);

		//confirm unique word count
		assertEquals(3, book.getUniqueWordCount(), "The unique word count is incorrect. The expected answer is 3.");

		//create list and book
		bookLines = new ArrayList<String>();
		bookLines.add("one two three.  four five six.  ONE.");
		book = new Book(bookLines);

		//confirm unique word count
		assertEquals(6, book.getUniqueWordCount(), "The unique word count is incorrect. The expected answer is 6.");

		//create list and book
		bookLines = new ArrayList<String>();
		bookLines.add("Title: My Book title");
		bookLines.add("Author: My book author");
		bookLines.add("one, two, three.  four, five, six.");
		book = new Book(bookLines);

		//confirm unique word count
		assertEquals(10, book.getUniqueWordCount(), "The unique word count is incorrect. The expected answer is 10.");

		//confirm approximate unique word count for cat in the hat
		assertTrue(this.catInTheHatBook.getUniqueWordCount() >= 50 && this.catInTheHatBook.getUniqueWordCount() <= 60, "The approximate unique word count for 'The Cat in the Hat' is incorrect. It should be greater than or equal to 50 and less than or equal to 60.");

		///// DO NOT MODIFY THE TEST CODE ABOVE! ///////
		////////////////////////////////////////////////


		// TODO insert 2 additional test cases
		// Hint(s): Create new books to add lines to and test the unique words. You can create a smaller version of War and Peace and Siddhartha to test on.

		// Confirm the unique word count for a book with repeated words
		List<String> repeatedWordsBookLines = new ArrayList<String>();
		repeatedWordsBookLines.add("Hello i really wanted a hello");
		Book repeatedWordsBook = new Book(repeatedWordsBookLines);
		assertEquals(5, repeatedWordsBook.getUniqueWordCount(), "The unique word count is incorrect for a book with repeated words.");

		// Confirm the unique word count for a book with words in different cases
		List<String> differentCaseWordsBookLines = new ArrayList<String>();
		differentCaseWordsBookLines.add("Hello i really WANTED a hello");
		Book differentCaseWordsBook = new Book(differentCaseWordsBookLines);
		assertEquals(5, differentCaseWordsBook.getUniqueWordCount(), "The unique word count is incorrect for a book with words in different cases.");

	}

	@Test
	void testGetSpecificWordCount() {
		
		////////////////////////////////////////////////
		///// DO NOT MODIFY THE TEST CODE BELOW! ///////
		
		//create list and book
		List<String> bookLines = new ArrayList<String>();
		bookLines.add("one two three");
		Book book = new Book(bookLines);
		
		//confirm specific word count
		assertEquals(1, book.getSpecificWordCount("three"), "The specific word count is incorrect. The expected answer is 1.");
		
		//create list and book
		bookLines = new ArrayList<String>();
		bookLines.add("one two three.  four five six. ONE.");
		book = new Book(bookLines);
		
		//confirm specific word count
		assertEquals(2, book.getSpecificWordCount("one"), "The specific word count is incorrect. The expected answer is 2.");
		
		//create list and book
		bookLines = new ArrayList<String>();
		bookLines.add("Title: My Book title");
		bookLines.add("Author: My book author");
		bookLines.add("Review: GREAT BOOK!");
		book = new Book(bookLines);
		
		//confirm specific word count
		assertEquals(3, book.getSpecificWordCount("book"), "The specific word count is incorrect. The expected answer is 3.");
		
		//confirm approximate specific word count for cat in the hat
		assertTrue(this.catInTheHatBook.getSpecificWordCount("sit") >= 3 && this.catInTheHatBook.getSpecificWordCount("sit") <= 5, "The approximate specific word count of the word 'sit' in 'The Cat in the Hat' is incorrect. It should be greater than or equal to 3 and less than or equal to 5.");
		
		///// DO NOT MODIFY THE TEST CODE ABOVE! ///////
		////////////////////////////////////////////////
		
		
		// TODO insert 2 additional test cases
        // Hint(s): Confirm approximate specific word count for different words in war and peace and siddhartha book objects

		// Confirm the specific word count for a book with repeated words
		List<String> repeatedWordsBookLines = new ArrayList<String>();
		repeatedWordsBookLines.add("He once didn't find it attractive. How he perceived life was different from his peers");
		Book repeatedWordsBook = new Book(repeatedWordsBookLines);
		assertEquals(2, repeatedWordsBook.getSpecificWordCount("he"), "The specific word count is incorrect for a book with repeated words.");


		// Confirm the specific word count for "War and Peace" book
		assertEquals(0, this.warAndPeaceBook.getSpecificWordCount("milestone"), "The specific word count for the word 'war' in 'War and Peace' is incorrect.");

	}

}