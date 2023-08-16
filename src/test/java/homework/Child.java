package homework;

public class Child {
    //-----------------------ATTRIBUTES--------------------
    private String name;
    private String homeSobriquet;
    private int heightInCm;
    private double weightInKg;
    private String eyesColor;
    private int milkTeethNumber;
    private int permanentTeethNumber;
    private int ageInMouth;
    private String harmfulness;
    private String obedience;
    private String laziness;

    //---------------------------GETTERS/SETTERS------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeSobriquet() {
        return homeSobriquet;
    }

    public void setHomeSobriquet(String homeSobriquet) {
        this.homeSobriquet = homeSobriquet;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public int getMilkTeethNumber() {
        return milkTeethNumber;
    }

    public void setMilkTeethNumber(int milkTeethNumber) {
        this.milkTeethNumber = milkTeethNumber;
    }

    public int getPermanentTeethNumber() {
        return permanentTeethNumber;
    }

    public void setPermanentTeethNumber(int permanentTeethNumber) {
        this.permanentTeethNumber = permanentTeethNumber;
    }

    public int getAgeInMouth() {
        return ageInMouth;
    }

    public void setAgeInMouth(int ageInMouth) {
        this.ageInMouth = ageInMouth;
    }

    public String getHarmfulness() {
        return harmfulness;
    }

    public void setHarmfulness(String harmfulness) {
        this.harmfulness = harmfulness;
    }

    public String getObedience() {
        return obedience;
    }

    public void setObedience(String obedience) {
        this.obedience = obedience;
    }

    public String getLaziness() {
        return laziness;
    }

    public void setLaziness(String laziness) {
        this.laziness = laziness;
    }

    //-----------------------------CUSTOM METHODS-------------------
    public void printBothNames() {
        System.out.println(name + " cold as " + homeSobriquet);
    }

    public void printAllTeeth() {
        System.out.println(milkTeethNumber + " + " + permanentTeethNumber);
    }
}
