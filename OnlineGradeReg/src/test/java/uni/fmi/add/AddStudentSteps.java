package uni.fmi.add;

//import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.add.models.HomePage;
import uni.fmi.add.models.StudentForm;

public class AddStudentSteps {
	
	HomePage homePage;
	StudentForm form;
	
	@Given("^Потребителят влиза в системата$")
	public void navigateToHomePage() throws Throwable {
		homePage = new HomePage();
	}

	@Given("^отваря формата за данни на ученик$")
	public void clickHomePageStudentButton() throws Throwable {
	   form = homePage.clickStudnetButton();
	}

	@When("^въвежда данните на ученика$")
	public void addfirstName() throws Throwable {
	    form.addfirstName("Ivan");
	}
	

	@When("^въвежда данните на ученика без фамилия$")
	public void addlastName() throws Throwable {
	    form.addlastName("");
	}
	
	@When("^натиска бутона въведи$")
	public void clikStudentFormStudentButton() throws Throwable {
		form.clickStudentButton();
	}
	
	@Then("^вижда информация \"([^\"]*)\"$")
	public void chekStudentMessage(String expectedMessage) throws Throwable {
	   form.getMessage();
	}


}
