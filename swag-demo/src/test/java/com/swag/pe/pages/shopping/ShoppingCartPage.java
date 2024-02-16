package com.swag.pe.pages.shopping;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShoppingCartPage extends PageObject {
    @FindBy(xpath = "//button[@class='btn btn_action btn_medium checkout_button ']")
    protected WebElementFacade checkoutButton;

    @FindBy(id = "first-name")
    protected WebElementFacade txt_firsname;

    @FindBy(id = "last-name")
    protected WebElementFacade txt_lastname;

    @FindBy(id = "postal-code")
    protected WebElementFacade txt_postal;

    @FindBy(xpath = "//input[@class='submit-button btn btn_primary cart_button btn_action']")
    protected WebElementFacade continueButton;

    @FindBy(xpath = "//button[@class='btn btn_action btn_medium cart_button']")
    protected WebElementFacade finishButton;

}
