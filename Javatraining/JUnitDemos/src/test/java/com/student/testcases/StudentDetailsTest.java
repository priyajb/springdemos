package com.student.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.exception.InvalidNumberException;
import com.voya.training.StudentDetails;

class StudentDetailsTest {
	StudentDetails studentdetails=null;

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
		studentdetails=new StudentDetails();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("called after each testcases");
	}

//	@Test
//	void testTotalMarks() throws InvalidNumberException {
//		int marks1=50;
//		int marks2=70;
//		int marks3=70;
//		int expected=marks1+marks2+marks3;
//		int actual=studentdetails.totalMarks(marks1,marks2,marks3);
//		Assertions.assertThrows(null, null)
//		assertEquals(expected,actual,"enter dfghjk");
//		
//		
//	}
//	@Test
//	@Tag("neg")
//	void testNegativeMarks() {
//		Assertions.assertThrows(InvalidNumberException.class,()->studentdetails.totalMarks(90,-20,30));
//	}
//	
//	@Test
//	void testGreaterMarks() {
//		Assertions.assertThrows(InvalidNumberException.class,()->studentdetails.totalMarks(100,20,0));
//	}

}
