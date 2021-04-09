import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Supplier;

public class CreateCar {
    private static int NEW_ID = 1;

    public static Car newCar() {
        Car x;

        Scanner f = new Scanner(System.in);

        // Am adaugat toate modelele posibile intr-un map
        HashMap<String, Supplier<Car>> existingCars = new HashMap<>();

         existingCars.put("Audi", Audi::new);
         existingCars.put("Bmw", Bmw::new);
         existingCars.put("Jaguar", Jaguar::new);
         existingCars.put("Jeep", Jeep::new);
         existingCars.put("Mercedes", Mercedes::new);
         existingCars.put("Peugeot", Peugeot::new);
         existingCars.put("Volkswagen", Volkswagen::new);
         existingCars.put("Volvo", Volvo::new);

        System.out.println("Car model: ");
        while(true) {
            String model = f.nextLine();
            if(existingCars.containsKey(model)) {
                x = existingCars.get(model).get();
                break;
            }

            System.out.print("The only existing car models are: ");
            existingCars.forEach((type, value) -> System.out.print(type + "; "));
            System.out.println("\n");
        }

        x.setId(NEW_ID);

        NEW_ID++;

        System.out.println("Car with id: " + x.getId() + " was successfully created!");

        return x;
    }
}
