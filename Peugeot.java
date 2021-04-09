public class Peugeot extends Car {
    @Override
    public String getModel() {
        return "Peugeot";
    }

    @Override
    public int getPrice() {
        return 37000;
    }

    @Override
    public String getFuelType() {
        return "diesel";
    }

    @Override
    public int getFabricationYear() {
        return 2018;
    }
}
