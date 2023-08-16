import homework.Child;
import org.junit.jupiter.api.Test;

public class WorkingWithChild {
    @Test
    public void creatingAndUsingObjects() {

        Child manu = new Child();
        manu.setName("Manu");
        manu.setHomeSobriquet("Princess");
        manu.setMilkTeethNumber(12);
        manu.setPermanentTeethNumber(10);
        manu.setEyesColor("green");
        manu.setAgeInMouth(80);
        manu.setHeightInCm(134);
        manu.setWeightInKg(28);

        System.out.println(manu.getName());
        System.out.println(manu.getHomeSobriquet());
        System.out.println(manu.getName() + " cold as " + manu.getHomeSobriquet());

        manu.setHomeSobriquet("Enema");
        System.out.println(manu.getHomeSobriquet());
        manu.printBothNames();

        System.out.println(manu.getMilkTeethNumber());
        System.out.println(manu.getPermanentTeethNumber());
        System.out.println(manu.getMilkTeethNumber() + " + " + manu.getPermanentTeethNumber());

        manu.setMilkTeethNumber(10);
        manu.setPermanentTeethNumber(14);
        manu.printAllTeeth();

    }
}
