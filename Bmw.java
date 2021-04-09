public class Bmw extends Car {
    @Override
    public String getModel() {
        return "Bmw";
    }

    @Override
    public int getPrice() {
        return 80000;
    }

    @Override
    public String getFuelType() {
        return "benzine";
    }

    @Override
    public int getFabricationYear() {
        return 2021;
    }
}
