import java.util.*;

public class Service {
    private final Set<DealerShip> dealerships = new TreeSet<>();

    // 1. La primul pas dorim sa cream un dealership nou
    public void newDealerShip() {
        CreateDealerShip x = new CreateDealerShip();
        DealerShip y = CreateDealerShip.newDealerShip();
        dealerships.add(y);
    }

    // 2. Vrem sa adaugam masini in reprezentante
    public void addCarInDS(int dealershipId) throws Brick {
        DealerShip x = getDSById(dealershipId);
        CreateCar car = new CreateCar();
        Car y = CreateCar.newCar();

        x.addCar(y);
    }

    // 3. Vrem sa afisam toate masinile dintr-o anumita reprezentanta
    public void showCars(int dealershipId) throws Brick {
        System.out.println(getDSById(dealershipId).getCarDetails());
    }

    // 4. Vrem sa afisam masinile dintr-o reprezentanta in ordine descrescatoare a anilor
    public void sortCars(int dealershipId) throws Brick {
        getDSById(dealershipId).sortCarsYear(); // Mai intai o sortez
        getDSById(dealershipId).reverseList(); // Apoi o inversez
    }

    // 5. Ma intereseaza motorizarea cea mai frecvent dorita
    public String bestFuelType() {
        Map<String, Integer> popular = new HashMap<>();
        Integer Max = -1;
        String motorizare = "No se puede mi amigo";

        // intru in dealership-uri pe rand
        for(DealerShip x: dealerships) {
            // pentru fiecare masina din dealership verif cea mai frecventa motorizare
            for(Car y: x.getCars()) {
                String fuelType = y.getFuelType();
                if(popular.containsKey(fuelType)) {
                    popular.put(fuelType, popular.get(fuelType) + 1);
                }
                else {
                    popular.put(fuelType, 1);
                }

                if(popular.get(fuelType) > Max) {
                    Max = popular.get(fuelType);
                    motorizare = fuelType;
                }
            }
        }
        return motorizare;
    }

    // 6. Vreau sa afisez daca se pot produce anumite masini in functie de motorizare, intrucat am vazut inainte care este cea mai populara motorizare
    public int showLikes(String fuelType) throws Brick {
        Map<String, Integer> exists = new HashMap<>();

        for(DealerShip x: dealerships) {
            for(Car y: x.getCars()) {
                fuelType = y.getFuelType();
                if(exists.containsKey(fuelType)) {
                    exists.put(fuelType, exists.get(fuelType) + 1);
                }
                else {
                    exists.put(fuelType, 1);
                }
                if(exists.get(fuelType) >= 1) {
                    return 1;
                }
            }
        }
        return 0;
    }

    // 7. Vreau sa pot verifica daca o masina exista sau nu intr-un dealership, in functie de nume
    public boolean carExists(int dealershipId, String carName) throws Brick {
        return getDSById(dealershipId).carExists(carName);
    }

    // 8. Vreau sa pot vinde o masina creata anterior
    public void sellCar(int dealershipId, String carName) throws Brick {
        DealerShip x = getDSById(dealershipId);
        x.sellCar(carName);
    }

    // 9. Vreau sa am optiunea sa elimin toate masinile adaugate anterior intr-un dealership
    public void clearOutDS(int dealershipId) throws Brick {
        getDSById(dealershipId).clearDS();
    }

    private DealerShip getDSById(int dealershipId) throws Brick {
        for(DealerShip x: dealerships) {
            if(x.getId() == dealershipId) {
                return x;
            }
        }
        throw new Brick("This dealership does not exist.");
    }
}
