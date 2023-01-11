import java.sql.Array;
import java.util.Arrays;

public class Restaurant {
    private static int tableLimit = 5;
    private static Client[] clients = new Client[10];
    private Boolean fullCapacity;
    private int numberOfOccupiedTables;
    private static Table[] tables = new Table[10];

    private String[] menu = {"Fish and Chips", "Steak", "Pasta", "Risotto"};
    private double[] menuPrice = {5.99, 10, 7.5, 6};
    private int clientCounter;


    private static int restaurantCount;

    public Restaurant() {

        /*Client [] clients = new Client[50];
        Table [] tables = new Table[10];
        */
        for (int i = 0; i < tables.length; i++) {
            tables[i] = new Table(true, "", i + 1, 0);
        }

        for (int c = 0; c < clients.length; c++) {
            clients[c] = new Client(c + 1, (int) (Math.random() * 10 + 1));
        }
    }

    public void getClientCounter() {
        System.out.println("The restaurant currently has " + clientCounter + " clients.");
    }

    public void openRestaurant() {
        System.out.println("+++++Welcome to the Restaurant+++++ \nThis is our menu:");
        for (int r = 0; r < menu.length; r++) {
            System.out.print(menu[r]);
            System.out.println(" - " + menuPrice[r] + " €");
        }
        System.out.println("+".repeat(30));
    }

    public void findTable() {

        boolean allEqual = Arrays.asList(tables).contains(true);

        /*int x = 0;
        while (allEqual == false) {
            if (clients[x].getClientNumber() > 5) {
                System.out.println(clients[x].getClientNumber() + " clients showed up. Tables cant hold more than 5 clients");

            } //else for (int k = 0; k < tables.length; k++) {
            if (tables[x].getFree() == true && clients[x].getClientNumber() < 6) {
                int clientSet = 0;
                tables[clientSet].setFree(false);
                System.out.println(clients[clientSet].getClientNumber() + " clients sat on table number: " + tables[clientSet].getTableNumber());
                clientCounter += clients[clientSet].getClientNumber();

            }
            System.out.println("=".repeat(30));
        }*/
        /*int currentTable = 0;
        do {
            if(clients[currentTable].getClientNumber() < tableLimit && tables[currentTable].getFree() == true){
                tables[currentTable].setFree(false);
                System.out.println(clients[currentTable].getClientNumber() + " clients sat on table number: " + tables[currentTable].getTableNumber());
                clientCounter += clients[currentTable].getClientNumber();

                currentTable++;
            }else {
                System.out.println(clients[currentTable].getClientNumber() + " Clients need table. No table that can hold more than 5 clients");
                System.out.println("Table " + tables[currentTable].getTableNumber()+ " is free");
                tables[currentTable].setFree(true);
            }

            System.out.println("=".repeat(30));
        } while (currentTable < 10 || currentClientGroup < 10);*/

        int tableCount = 0;
        for (int k = 0; k < clients.length; k++) {
            if (clients[k].getClientNumber() < tableLimit && tables[tableCount].getFree() == true) {
                tables[k].setFree(false);
                System.out.println(clients[k].getClientNumber() + " clients sat on table number: " + tables[tableCount].getTableNumber());
                clientCounter += clients[k].getClientNumber();
                tableCount++;
            } else {
                System.out.println(clients[k].getClientNumber() + " Clients need table. No table that can hold more than 5 clients");
                System.out.println("Table " + tables[tableCount].getTableNumber() + " is free");
                // tables[k].setFree(true);
            }

            System.out.println("=".repeat(30));
        }
    }

    public static void freeTable() {

    }

    public static int getRestaurantCount() {
        return restaurantCount;
    }

    public static void receiveOrder() {

    }

    public static void checkIfTableCanBeFreed() {
        for (int f = 0; f < tables.length; f++) {
            if (tables[f].getFree() == false && clients[f].getBill() == 0) {
                System.out.println("Table  " + tables[f].getTableNumber() + " can be freed");
            }
        }
    }

    private static void occupyTable() {

    }

}


