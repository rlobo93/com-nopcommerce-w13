package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {

    By booksText = By.xpath("//h1[contains(text(),'Books')]");


    public String getBooksText(){
        return getTextFromElement(booksText);
    }
}
