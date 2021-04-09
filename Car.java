public abstract class Car {
    private int carId;

    abstract String getModel();
    abstract int getPrice();
    abstract String getFuelType();
    abstract int getFabricationYear();

    public int getId() {
        return carId;
    }

    public void setId(int carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "Car id: " + carId + ", model: " + getModel() + " fabricated in: " + getFabricationYear() + ", is listed at: " + getPrice() + "$ and runs on: " + getFuelType();
    }
}
