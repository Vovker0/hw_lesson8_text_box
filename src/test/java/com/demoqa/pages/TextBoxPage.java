package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {

    SelenideElement pageHeader = $(".main-header");
    SelenideElement userNameInput = $("#userName");
    SelenideElement userEmailInput = $("#userEmail");
    SelenideElement currentAddressInput = $("#currentAddress");
    SelenideElement permanentAddressInput = $("#permanentAddress");
    SelenideElement submitButton = $("#submit");
    SelenideElement outputInfo = $("#output");
    SelenideElement outputName = outputInfo.$("#name");
    SelenideElement outputEmail = outputInfo.$("#email");
    SelenideElement outputCurrentAddress = outputInfo.$("#currentAddress");
    SelenideElement outputPermanentAddress = outputInfo.$("#permanentAddress");

    public TextBoxPage openPage() {
        open("/text-box");
        pageHeader.shouldHave(exactText("Text Box"));
        return this;
    }

    public TextBoxPage setUserName(String name) {
        userNameInput.setValue(name);
        return this;
    }

    public TextBoxPage setUserEmail(String email) {
        userEmailInput.setValue(email);
        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);
        return this;
    }

    public void submitForm() {
        submitButton.click();
    }

    public TextBoxPage checkOutputVisibility() {
        outputInfo.shouldBe(visible);
        return this;
    }

    public TextBoxPage checkEnteredData(String name, String email, String address1, String address2) {
        outputName.shouldHave(text(name));
        outputEmail.shouldHave(text(email));
        outputCurrentAddress.shouldHave(text(address1));
        outputPermanentAddress.shouldHave(text(address2));
        return this;
    }
}