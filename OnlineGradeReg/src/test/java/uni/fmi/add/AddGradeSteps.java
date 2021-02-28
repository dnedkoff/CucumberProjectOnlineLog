package uni.fmi.add;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.add.models.GradeForm;
import uni.fmi.add.models.HomePage;

public class AddGradeSteps {
	
	HomePage homePage;
	GradeForm form;

@Given("^Потребителят е в системата$")
public void navigateToHomePage() throws Throwable {
   homePage = new HomePage();
}

@Given("^отваря формата за оценка$")
	public void clickHomePageGradeButton() throws Throwable {
		   form = homePage.clickGradeButton();
}

@When("^въвежда оценка от 2 до 6$")
public void addValue() throws Throwable {
   form.addValue(2-6);
}


@When("^въвежда оценка по-голяма от 6$")
public void addValue1() throws Throwable {
    form.addValue(7);
}

@When("^въвежда оценка по-малка от 2$")
public void addValue3() throws Throwable {
 form.addValue(1);
}


@Then("^вижда съобщение с текст \"([^\"]*)\"$")
public void chekGradeMessage(String expectedMessage) throws Throwable {
	   form.getMessage();
}


}
