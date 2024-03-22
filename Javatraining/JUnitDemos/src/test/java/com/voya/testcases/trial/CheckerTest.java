package com.voya.testcases.trial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



class CheckerTest {
	

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
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Testing null")
	void testNull() {
		List<String> mylist=null;
		assertNull(mylist);
	}
	
	@Test
	@Tag("first")
	@DisplayName("Testing not null")
	void testNotNull() {
		List<String> mylist=new ArrayList<>();
		assertNotNull(mylist);
	}
@Test
@Tag("simple")
@DisplayName("testing string regerence")
void testSame() {
	String username="Jaya";
	String nusername="Jaya";
	
	assertSame(username,nusername,"references are not same");
}
	
}

