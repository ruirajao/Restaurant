import java.sql.Array;

public class Restaurant {
    private static Client [] clients = new Client[50];
    private Boolean fullCapacity;
    private int numberOfOccupiedTables;
    private static Table [] tables = new Table[10];

    private String  [] menu = {"Fish and Chips", "Steak", "Pasta", "Risotto"};
    private double  [] menuPrice = {5.99, 10, 7.5, 6 };
    private int clientCounter;

    private static int restaurantCount;

    public Restaurant() {

        /*Client [] clients = new Client[50];
        Table [] tables = new Table[10];
*/
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

    public void openRestaurant(){
        System.out.println("+++++Welcome to the Restaurant+++++ \n This is our menu:");
        for(int r  =0; r< menu.length; r++){
            System.out.print( menu[r]);
            System.out.println(" - "  +menuPrice[r] + " €");
        }
        System.out.println("+". repeat(30));
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
    public static void checkIfTableCanBeFreed() {
        for (int f =0; f < tables.length; f++){
            if (tables[f].getFree() == false && clients[f].getBill()==0){
                System.out.println("Table  " + tables[f].getTableNumber()  + " can be freed");
            }
        }

    }

    private static void  occupyTable() {

    }

}
