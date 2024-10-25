package com.swaglabs.app.stepdenitions;

import com.swaglabs.app.drivers.DriverAppium;
import com.swaglabs.app.exections.UnexpectedResult;
import com.swaglabs.app.models.DataLoginModel;
import com.swaglabs.app.models.FillFormModel;
import com.swaglabs.app.questions.LoginSuccessfull;
import com.swaglabs.app.questions.ValidateBuy;
import com.swaglabs.app.questions.ValidateCart;
import com.swaglabs.app.questions.ValidateDataUser;
import com.swaglabs.app.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ComprasStepDefinitions {

    public static Actor user = Actor.named("test");

    @Before
    public void userOpensAppSwaglabs() {
        user.can(BrowseTheWeb.with(DriverAppium.yourBrowser().on()));
    }

    @When("^he load the SauceDemo page and he enter his credentials$")
    public void heLoadTheSauceDemoPageAndHeEnterHisCredentials(List<DataLoginModel> login) {
        user.wasAbleTo(LoginPageTask.enterCredentials(login.get(0)));
        user.should(seeThat(LoginSuccessfull.seesProducts(), Matchers.equalTo(true)).orComplainWith(UnexpectedResult.class, UnexpectedResult.LOGIN_FAIL));
    }


    @Given("^select the product to buy$")
    public void selectTheProductToBuy(List<DataLoginModel> login){
        user.attemptsTo(SelectProductTask.selectProducts(login.get(0)));
    }

    @Given("^he do click on shopping cart$")
    public void heDoClickOnShoppingCart() {
        user.attemptsTo(GoToCartTask.goCart());
        user.should(seeThat(ValidateCart.seeCart(), Matchers.equalTo(true)).orComplainWith(UnexpectedResult.class, UnexpectedResult.CART_EMPTY));
        user.attemptsTo(CheckoutYourCartTask.checkCart());

    }

    @Given("^he do click on button checkout for fill form$")
    public void heDoClickOnButtonCheckoutForFillForm(List<FillFormModel> fillForm) {
        user.attemptsTo(FillFormTask.personalData(fillForm.get(0)));
        user.should(seeThat(ValidateDataUser.insertData(), Matchers.equalTo(true)).orComplainWith(UnexpectedResult.class, UnexpectedResult.FILL_FORM_FAIL));
    }

    @Then("^customer can finish to pay$")
    public void customerCanFinishToPay(){
        user.attemptsTo(OverviewCartTask.finish());
        user.should(seeThat(ValidateBuy.seeMsmSuccessful(), Matchers.equalTo(true)).orComplainWith(UnexpectedResult.class, UnexpectedResult.OVERVIEW_FAIL));
    }
}
