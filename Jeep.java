public class Jeep extends Car {
    @Override
    public String getModel() {
        return "Jeeps";
    }

    @Override
    public int getPrice() {
        return 80000;
    }

    @Override
    public String getFuelType() {
        return "diesel";
    }

    @Override
    public int getFabricationYear() {
        return 2021;
    }
}
