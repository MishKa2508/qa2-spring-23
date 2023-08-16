import homework.Car;
import org.junit.jupiter.api.Test;

public class WorkingWithCar {
    @Test
    public void creatingAndUsingObjects() {
    Car corvette = new Car();
    corvette.setBrandName("Chevrolet");
    corvette.setModelName("Corvette C3");
    corvette.setOwnerName("Mishki Lautishki");
    corvette.setColor("red");
    corvette.setDoorsNumber(3);
    corvette.setManufactureYear(1980);

        System.out.println(corvette.getBrandName());
        System.out.println(corvette.getModelName());
        System.out.println(corvette.getOwnerName());
        System.out.println(corvette.getBrandName() + " " + corvette.getModelName() + " belongs to " + corvette.getOwnerName());

        corvette.setModelName("Corvette Stringray");
        corvette.printFullData();

        System.out.println(corvette.getManufactureYear());
        System.out.println(corvette.getDoorsNumber());
        System.out.println(corvette.getColor());
        System.out.println(corvette.getManufactureYear() + " year, " + corvette.getDoorsNumber() + " doors, " + corvette.getColor() + " color ");

        corvette.setManufactureYear(2023);
        corvette.setColor("black");
        corvette.printCarData();
    }
}
