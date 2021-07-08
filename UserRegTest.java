package com.bridgelabz.userReg;

import org.junit.*;;

public class UserRegTest {

	UserReg userReg;

	@Before
	public void setUp() {
		UserReg userReg = new UserReg();

	}

	@Test
	public void givenName_WhenFirstNameCaptial_ShouldReturn() {

		boolean actual = userReg.isFirstName("Sunu");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenName_WhenFirstName_FirstCharacter_IsInLowerCase() {

		boolean actual = userReg.isFirstName("sunu");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenFirstName_SpecialCharacter_IsThere_OrNot() {

		boolean actual = userReg.isFirstName("Sunu%");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenFirstName_HasNumbers() {

		boolean actual = userReg.isFirstName("Sunu1");
		Assert.assertFalse(actual);
	}
	@Test
	public void givenName_WhenLastNameCaptial_ShouldReturn() {

		boolean actual = userReg.isLastName("Nandakumar");
		Assert.assertTrue(actual);
	}
	@Test
	public void givenName_WhenLastName_FirstCharacter_IsInLowerCase() {

		boolean actual = userReg.isLastName("nandakumar");
		Assert.assertFalse(actual);
	}
	@Test
	public void givenName_WhenLastName_SpecialCharacter_IsThere_OrNot() {

		boolean actual = userReg.isLastName("Nandakumar%");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenNumber_WhenNumber_IsCorrect_ShouldReturn() {
		boolean actual = userReg.isMobileFormatValid("91 8153857156");
		Assert.assertTrue(actual);
	}
	@Test
	public void givenNumber_WhenNumber_HasNoSpace_AfterTheFirst_TwoCharacter() {
		boolean actual = userReg.isMobileFormatValid("918153857156");
		Assert.assertFalse(actual);
	}
	@Test
	public void givenNumber_WhenNumber_HasMore_ThanTen_Characters() {
		boolean actual = userReg.isMobileFormatValid("91 81538571516");
		Assert.assertFalse(actual);
	}
	@Test
	public void givenNumber_WhenNumber_HasSpecial_Characters() {
		boolean actual = userReg.isMobileFormatValid("91 815385715%6");
		Assert.assertFalse(actual);
	}
	@Test
	public void givenNumber_WhenNumber_HasMore_ThanTwo_Characters_BeforeSpace() {
		boolean actual = userReg.isMobileFormatValid("911 815385715%6");
		Assert.assertFalse(actual);
	} 
	@Test
	public void givenPassword_WhenPassword_IsCorrect() {
		boolean actual = userReg.isPasswordValid("Asdfghjk&");
		Assert.assertTrue(actual);
	}
	@Test
	public void givenPassword_WhenPassword_HasNot_UpperCase() {
		boolean actual = userReg.isPasswordValid("asdfg");
		Assert.assertTrue(actual);
	}
	
//	@Test
//	public void givenPassword_WhenPassword_HasLessThan_EightCharacters() {
//		boolean actual = userReg.isPasswordValid("asdfgh&");
//		Assert.assertTrue(actual);
//	}
}
