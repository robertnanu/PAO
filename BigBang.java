import java.util.Scanner;

public class BigBang {

    public static void main(String[] args) throws Brick {
        Scanner f = new Scanner(System.in);

        Service bang = new Service();

        boolean ok = true;

        System.out.println("Hello and welcome to our first version of the Cars World application!");
        System.out.println("This application has been created by the one and only Nanu Robert... Enjoy!");
        System.out.println("Due to the fact that this is only the first version of the app, our menu is yet to grow, but still, here it is:");

        while (ok) {
            System.out.println("1. The first step is the creation, the start of a new beginning! Please press 1 to create a new dealership!");
            System.out.println("2. Now let's fill your new dealership up! Please press 2 to add new cars in the dealerships previously created!");
            System.out.println("3. Let's check if everything works fine until this point! Please press 3 in order to see what cars you have added in your dealerships!");
            System.out.println("4. Want to see details about the newest cars on the market? Please press 4 and you will receive a list of cars, from the newest models, to the oldest!");
            System.out.println("5. Not sure what kind of fuel type is better in the modern world that we live in? Please press 5 to check the most popular cars by fuel type!");
            System.out.println("6. Now that you know which is the most popular fuel type, please press 6 and we will let you now if you can create a car with set fuel type!");
            System.out.println("7. You know the name of the car that think fits you best? Please press 7 and you will be able to search for that car in our dealerships by name!");
            System.out.println("8. You wish to sell/buy a car created previously? Please press 8 in order to make the life changing deal!");
            System.out.println("9. You've run into some illegal activities? No worry we got you covered, but don't tell anyone! Please press 9 in order to erase all evidence of the above!");
            System.out.println("10. Exit");

            String received = f.nextLine();
            switch(received) {
                case "1":
                    bang.newDealerShip();
                    System.out.println("\n");
                    break;
                case "2":
                    System.out.println("Ok, so you want to add a car... Please enter the dealership's id in which you want to add it: ");
                    int dealershipId = f.nextInt();
                    f.nextLine();
                    bang.addCarInDS(dealershipId);
                    System.out.println("\n");
                    break;
                case "3":
                    System.out.println("Please enter the dealership's id of which you want to show all the cars:");
                    dealershipId = f.nextInt();
                    f.nextLine();
                    bang.showCars(dealershipId);
                    System.out.println("\n");
                    break;
                case "4":
                    System.out.println("Please enter a dealership Id:");
                    dealershipId = f.nextInt();
                    f.nextLine();
                    System.out.println("We have sorted the list by the newest models which are available for sale:");
                    bang.sortCars(dealershipId);
                    System.out.println("\n");
                    break;
                case "5":
                    String fuelType = bang.bestFuelType();
                    System.out.println("The most popular fuel type is: " + fuelType);
                    System.out.println("\n");
                    break;
                case "6":
                    System.out.println("Please enter the fuel type that you wish to verify:");
                    String yourFuel = f.nextLine();
                    //f.nextLine();
                    if(bang.showLikes(yourFuel) == 1) {
                        System.out.println("Yes, we can build cars with that fuel type!");
                    }
                    else {
                        System.out.println("No, we can't build cars with that fuel type!");
                    }
                    System.out.println("\n");
                    break;
                case "7":
                    System.out.println("Please enter a dealership Id:");
                    dealershipId = f.nextInt();
                    f.nextLine();
                    System.out.println("Please enter the name of the car you wish to search:");
                    String carName = f.nextLine();
                    if (bang.carExists(dealershipId, carName)) {
                        System.out.println("Yes, the car you have searched is available in out dealership!");
                        System.out.println("\n");
                        break;
                    }
                    System.out.println("Yes, the car you have searched is available in out dealership!");
                    System.out.println("\n");
                    break;
                case "8":
                    System.out.println("Please enter a dealership Id:");
                    dealershipId = f.nextInt();
                    f.nextLine();
                    System.out.println("Please enter the name of the car you wish to buy:");
                    carName = f.nextLine();
                    bang.sellCar(dealershipId, carName);
                    System.out.println("Congratulations! The car has been bought!");
                    System.out.println("\n");
                    break;
                case "9":
                    System.out.println("Please enter a dealership Id:");
                    dealershipId = f.nextInt();
                    f.nextLine();
                    bang.clearOutDS(dealershipId);
                    System.out.println("It'll be our little secret!");
                    System.out.println("\n");
                    break;
                case "10":
                    ok = false;
                    break;
            }
        }
    }
}