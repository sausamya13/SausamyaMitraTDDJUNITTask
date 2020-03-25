package tddjunittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeleteFirst2CharsTest {

	DeleteFirst2Chars deleteFirst2Chars;
	@BeforeEach
	void setUp(){
		deleteFirst2Chars=new DeleteFirst2Chars();	
	}
	@Test
	void test2Chars() 
	{
	assertEquals(" ",deleteFirst2Chars.delete("AA") );
		
	}
	@Test
	void test4Chars() 
	{
	assertEquals("BC",deleteFirst2Chars.delete("AABC") );
		
	}
	@Test
	void testNChars() 
	{
		assertEquals("BCEFGHIJK",deleteFirst2Chars.delete("AABCEFGHIJK") );
		
	}
	@Test
	void test1Chars() 
	{
	assertEquals("A",deleteFirst2Chars.delete("A") );
		
	}
	@Test
	void testEmptyChars() 
	{
	assertEquals("",deleteFirst2Chars.delete("") );
		
	}
}
