package com.voya.sample;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.voya.testcases.CalculatorTest;
import com.voya.training.Calculator;
import com.voya.training.StudentDetails;
//import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({CalculatorTest.class,StudentDetails.class})
//@RunWith(JUnitPlatform.class)
//@SelectPackages({"com.voya.testcases"})
//@IncludePackages({"com.voya.testcases.trial"})
//@ExcludePackages({"com.voya.testcases.greet"})
//@SelectClasses({CalculatorTest.class})
@ExcludeTags({"first"})
public class AllTests {

}