public class Mercedes extends Car {
    @Override
    public String getModel() {
        return "Mercedes";
    }

    @Override
    public int getPrice() {
        return 145000;
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
