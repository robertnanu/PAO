public class Volkswagen extends Car {
    @Override
    public String getModel() {
        return "Volkswagen";
    }

    @Override
    public int getPrice() {
        return 76000;
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
