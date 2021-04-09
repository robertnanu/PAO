public class Jaguar extends Car {
    @Override
    public String getModel() {
        return "Jaguar";
    }

    @Override
    public int getPrice() {
        return 43000;
    }

    @Override
    public String getFuelType() {
        return "hybrid";
    }

    @Override
    public int getFabricationYear() {
        return 2019;
    }
}
