package com.voya.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.training.Calculator;

 public class CalculatorTest {
	Calculator calculator=null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called before all the test cases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called before all the test cases");
	}
	

	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
		System.out.println("called before each testcases");
	
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("called after each testcases");
	}

	@Test
	void testSum() {
		int actual=calculator.sum(10, 20);
		Assertions.assertEquals(30, actual,"output should be 30");
	}
    
	@Test
	@Tag("first")
	void testProduct() {
		int actual=calculator.product(3, 9);
		Assertions.assertEquals(27, actual,"product should be 27");
	}
	@Test
	@DisplayName("testing sum method")
	void testSum1() {
		int actual=calculator.sum(4, 6);
		assertEquals(10,actual,"output should be 10");
	}
	@Test
	@Disabled
	@DisplayName("testing greet method")
	void testGreet() {
		String username="Jaya";
		String actual=calculator.greetMessage(username);
		assertEquals("Welcome JAYA",actual,"not a match");
	}
	@Test
	
	//@DisplayName("testing show method")

	void testShowCourses() {
		List<String> expected=Arrays.asList("Angular","CSS","Html","Java","Spring");
		List<String> coursesInput=Arrays.asList("CSS","Java","Spring","Angular","Html");
		
		List<String> actual=calculator.showCourses(coursesInput);
		assertEquals(expected,actual);
	}
	
	
}
