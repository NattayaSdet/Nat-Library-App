package com.nat.library.pages;

import com.nat.library.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.getDriver(), this);


    }
}
