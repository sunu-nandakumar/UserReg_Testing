package com.bridgelabz.userReg;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailTest {

	String email;
	boolean expectedOutput;

	public EmailTest(String email, boolean expectedOutput) {
		this.email = email;
		this.expectedOutput = expectedOutput;

	}
@Parameterized.Parameters
	public static Collection emailIdsWithExpectedOutput() {
		return Arrays.asList(new Object[][] { 
			{"abc@gmail.com",true},
			{"abc-100@gmail.com",true},
			{"abc.100@gmail.com",true},
			{"abc-100@Abc.com",true},
			{"abc-100@Abc.net",true},
			{"abc.100@Abc.com.au",true},
			{"abc@1.com",true},
			{"abc@gmail.com.com",true},
			{"abc+100@yahoo.com",true},
			{"abc@.com.my",false},
			{"abc123@gmail.a",false},
			{"abc123@.com",false},
			{"abc123@.com.com",false},
			{".abc@Abc.com",false},
			{"abc()*@gmail.com",false},
			{"abc@%*.com",false},
			{"abc..2002@gmail.com",false},
			{"abc.@gmail.com",false},
			{"abc@abc@gmail.com",false},
			{"abc@gmail.com.1a",false},
			
			});
	}

	@Test
	public void givenEmailId_WithExpectedOutput_ShouldExpectedResult() {

		UserReg userReg = new UserReg();
		boolean actualResult = userReg.validateEmail(email);
		Assert.assertEquals(this.expectedOutput,actualResult);

	}

}
