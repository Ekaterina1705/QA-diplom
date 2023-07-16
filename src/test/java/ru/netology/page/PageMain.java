package ru.netology.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class PageMain {
    private final SelenideElement buyButton = $(byText("Купить"));
    private final SelenideElement creditButton = $(byText("Купить в кредит"));
    private final SelenideElement paymentByCard = $(byText("Оплата по карте"));
    private final SelenideElement paymentByCreditCard = $(byText("Кредит по данным карты"));

    public PagePayment payByDebitCard() {
        buyButton.click();
        paymentByCard.shouldHave(Condition.visible);
        return new PagePayment();
    }

    public PagePayment payCreditByCard() {
        creditButton.click();
        paymentByCreditCard.shouldHave(Condition.visible);
        return new PagePayment();
    }
}