package com.swag.pe.steps.shopping;

import com.swag.pe.pages.shopping.ShoppingCartPage;
import net.serenitybdd.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPage {
    @Step("Click en checkout")
    public void clickCheckoutButton(){
        checkoutButton.click();
    }
    @Step("Ingresar nombre")
    public void typeFirstName(String firstname){
        txt_firsname.sendKeys(firstname);
    }
    @Step("Ingresar apellido")
    public void typeLastName(String lastname){
        txt_lastname.sendKeys(lastname);
    }
    @Step("Ingresar codigo postal")
    public void typePostal(String postal){
        txt_postal.sendKeys(postal);
    }
    @Step("Click en continuar")
    public void clickContinue(){
        continueButton.click();
    }
    @Step("Click en finalizar")
    public void clickFinish(){
        finishButton.click();
    }

}
