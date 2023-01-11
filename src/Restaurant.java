import java.sql.Array;

public class Restaurant {
    private   Client [] clients = new Client[50];
    private Boolean fullCapacity;
    private int numberOfOccupiedTables;
    private Table [] tables = new Table[10];

    private String  [] menu = {"Fish and Chips", "Steak", "Pasta", "Risotto"};
    private int clientCounter;

    private static int restaurantCount;

    public Restaurant() {

        for(int i=0; i < tables.length; i++){
            tables[i] = new Table(true, "", i+1);
        }

        for (int c = 0; c < clients.length; c++){
            clients[c] = new Client(c+1, (int)(Math.random()*10 + 1));
        }

    }

    public int getClientCounter() {
        return clientCounter;
    }

    public void findTable() {

        for(int k=0; k < tables.length; k++){
            if(clients[k].getClientNumber() < 6 && tables[k].getFree() == true){
                tables[k].setFree(false);
                System.out.println(clients[k].getClientNumber() + " clients sat on table number: " + tables[k].getTableNumber());
                clientCounter += clients[k].getClientNumber();
            }else {
                System.out.println(clients[k].getClientNumber() + " Clients need table. No table that can hold more than 5 clients");
                System.out.println("Table " + tables[k].getTableNumber()+ " is free");
                tables[k].setFree(true);
            }
            System.out.println("=".repeat(30));

        }
    }

    public void freeTable() {

    }

    public static int getRestaurantCount() {
        return restaurantCount;
    }

    public static void receiveOrder() {
        
    }
    private static void checkIfTableCanBeFreed() {

    }

    private static void  occupyTable() {

    }

}
