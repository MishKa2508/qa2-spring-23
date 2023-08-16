package homework;

public class Car {
    //-----------------------ATTRIBUTES--------------------
    public String brandName;
    public String modelName;
    private String ownerName;
    private int manufactureYear;
    private double engineCapacity;
    private int doorsNumber;
    private String color;
    private double mileageInKm;

    //---------------------------GETTERS/SETTERS------------------

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileageInKm() {
        return mileageInKm;
    }

    public void setMileageInKm(double mileageInKm) {
        this.mileageInKm = mileageInKm;
    }

    // for learning Git

    //-----------------------------CUSTOM METHODS-------------------

    public void printFullData() {System.out.println(brandName + " " + modelName + " belongs to " + ownerName);}
    public void printCarData() {System.out.println(manufactureYear + " year, " + doorsNumber + " doors, " + color + " color ");}
}
