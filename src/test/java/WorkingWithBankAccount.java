import homework.BankAccount;
import org.junit.jupiter.api.Test;

public class WorkingWithBankAccount {
    @Test
    public void creatingAndUsingObjects() {
        BankAccount extra = new BankAccount();
        extra.setNumber("LV1234EXT5698745620015");
        extra.setOpenDate("24 October 2022");
        extra.setCreditCard("1512 7896 2564 4853");
        extra.setDebiCard("5684 1475 2395 2586");
        extra.setClientData("Vasja Pupkin 120588-10127");
        extra.setActive(true);

        System.out.println(extra.getNumber());
        System.out.println(extra.getOpenDate());
        System.out.println(extra.getNumber() + " open on " + extra.getOpenDate());

        extra.setOpenDate("28 November 2022");
        System.out.println(extra.getOpenDate());
        extra.printFullData();

        System.out.println(extra.getCreditCard());
        System.out.println(extra.getDebiCard());
        System.out.println(extra.getCreditCard() + " and " + extra.getDebiCard());

        extra.setCreditCard("2513 9854 1587 4855");
        extra.setDebiCard("1784 2674 1136 3315");
        extra.printBothCarts();

    }



}
