// 20220418
package book.file;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import book.file.BookFileReader;

class BookFileReaderTest {
	
	// lists to store lines from different loaded book files
	List<String> catInTheHat;
	List<String> warAndPeace;
	List<String> siddhartha;

	@BeforeEach
	void setUp() throws Exception {
		
		////////////////////////////////////////////////
		///// DO NOT MODIFY THE TEST CODE BELOW! ///////
		
		//load and parse cat in the hat snippet book file
		this.catInTheHat = BookFileReader.parseFile("the_cat_in_the_hat_snippet.txt");
		
		//load and parse war and peace book file
		this.warAndPeace = BookFileReader.parseFile("war_and_peace.txt");
		
		//load and parse siddhartha book file
		this.siddhartha = BookFileReader.parseFile("siddhartha.txt");
    
		///// DO NOT MODIFY THE TEST CODE ABOVE! ///////
		////////////////////////////////////////////////
		
	}

	@Test
	void testParseFile() {

		////////////////////////////////////////////////
		///// DO NOT MODIFY THE TEST CODE BELOW! ///////
		
		//create array with first 10 expected lines of cat in the hat snippet
		String[] expectedLines1Array = {
			"Title: The Cat in the Hat",
			"Author: Dr. Seuss",
			"The sun did not shine.",
			"It was too wet to play.",
			"So we sat in the house",
			"All that cold, cold, wet day.",
			"I sat there with Sally.",
			"We sat there, we two.",
			"And I said, \"How I wish",
			"We had something to do!\""
		};
		List<String> expectedLines1 = new ArrayList<String>(Arrays.asList(expectedLines1Array));
		
		//compare to first 10 actual lines of cat in the hat snippet
		assertEquals(expectedLines1, this.catInTheHat.subList(0, 10), "The expected 10 lines do not match the actual first 10 'Cat in the Hat' book lines.");
		
		///// DO NOT MODIFY THE TEST CODE ABOVE! ///////
		////////////////////////////////////////////////
		
		
		// TODO insert 2 additional test cases
        // Hint(s): Test sections of war and peace and siddhartha book files
		// Test for parsing the next 10 lines after the first 10 in  "War and Peace" book
		// Create array with next 10 expected lines of War and Peace
		String[] expectedNext10WarAndPeaceArray = {
				"Language: English",
				"WAR AND PEACE",
				"By Leo Tolstoy/Tolstoi",
				"CONTENTS",
				"BOOK ONE: 1805",
				"CHAPTER I",
				"CHAPTER II"
		};
		List<String> expectedNext10WarAndPeace = new ArrayList<String>(Arrays.asList(expectedNext10WarAndPeaceArray));

		// Compare to next 10 actual lines of War and Peace snippet
		assertEquals(expectedNext10WarAndPeace, this.warAndPeace.subList(5, 12),
				"The expected next 8 lines do not match the actual next 8 'War and Peace' book lines.");


		// Test case for parsing the next 9 lines after the first 8 in "Siddhartha" book
		// Create array with next 8 expected lines of Siddhartha
		String[] expectedNext8SiddharthaArray = {
				"by Hermann Hesse",
				"FIRST PART",
				"To Romain Rolland, my dear friend",
				"THE SON OF THE BRAHMAN",
				"In the shade of the house, in the sunshine of the riverbank near the",
				"boats, in the shade of the Sal-wood forest, in the shade of the fig tree",
				"is where Siddhartha grew up, the handsome son of the Brahman, the young",
				"falcon, together with his friend Govinda, son of a Brahman.  The sun",
				"tanned his light shoulders by the banks of the river when bathing,"
		};
		List<String> expectedNext8Siddhartha = new ArrayList<String>(Arrays.asList(expectedNext8SiddharthaArray));

		// Compare to next 8 actual lines of Siddhartha snippet
		assertEquals(expectedNext8Siddhartha, this.siddhartha.subList(8, 17),
				"The expected next 8 lines do not match the actual next 8 'Siddhartha' book lines.");

	}
}
