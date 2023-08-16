package homework;

import java.math.BigDecimal;

public class BankAccount {
    //-----------------------ATTRIBUTES--------------------
    private String number;
    private String openDate;
    private String clientData;
    private String debiCard;
    private String creditCard;
    private String currencyOptions;
    private BigDecimal accumulationPercents;
    private Boolean active;

    //---------------------------GETTERS/SETTERS------------------

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getClientData() {
        return clientData;
    }

    public void setClientData(String clientData) {
        this.clientData = clientData;
    }

    public String getDebiCard() {
        return debiCard;
    }

    public void setDebiCard(String debiCard) {
        this.debiCard = debiCard;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getCurrencyOptions() {
        return currencyOptions;
    }

    public void setCurrencyOptions(String currencyOptions) {
        this.currencyOptions = currencyOptions;
    }

    public BigDecimal getAccumulationPercents() {
        return accumulationPercents;
    }

    public void setAccumulationPercents(BigDecimal accumulationPercents) {
        this.accumulationPercents = accumulationPercents;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    //-----------------------------CUSTOM METHODS-------------------

    public void printFullData() {System.out.println(number + " open on " + openDate);}
    public void printBothCarts() {System.out.println(creditCard + " and " + debiCard);}
}