package com.demoqa.tests;

import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTest extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();

    String userFullName = "Gogi Vardanyan";
    String userEmail = "gogi@bigmir.net";
    String currentAddress = "12 Nahichevan street, Yerevan, Armenia";
    String permanentAddress = "135 Saburtali street, Tnilisi, Georgia";

    @Test
    void fillTextBoxTest() {
        textBoxPage.openPage()
                .setUserName(userFullName)
                .setUserEmail(userEmail)
                .setCurrentAddress(currentAddress)
                .setPermanentAddress(permanentAddress)
                .submitForm();

        textBoxPage.checkOutputVisibility()
                .checkEnteredData(userFullName,
                        userEmail,
                        currentAddress,
                        permanentAddress);
    }
}
