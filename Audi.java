public class Audi extends Car {
    @Override
    public String getModel() {
        return "Audi";
    }

    @Override
    public int getPrice() {
        return 68000;
    }

    @Override
    public String getFuelType() {
        return "diesel";
    }

    @Override
    public int getFabricationYear() {
        return 2020;
    }
}
