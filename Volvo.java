public class Volvo extends Car {
    @Override
    public String getModel() {
        return "Volvo";
    }

    @Override
    public int getPrice() {
        return 54000;
    }

    @Override
    public String getFuelType() {
        return "hybrid";
    }

    @Override
    public int getFabricationYear() {
        return 2017;
    }
}
