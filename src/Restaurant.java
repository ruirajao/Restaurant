import java.sql.Array;

public class Restaurant {
    private   Client [] clients = new Client[50];
    private Boolean fullCapacity;
    private int numberOfOccupiedTables;
    private Table [] tables = new Table[15];

    private static int restaurantCount;

    public Restaurant() {

        for(int i=0; i < tables.length; i++){
            tables[i] = new Table(false, "", i+1);
        }

    }

    public void findTable() {

        for(int k=0; k < tables.length; k++){
            if(tables[k].isFree()){
                tables[k].setFree(false);
                System.out.println("Clients sat on table number: " + tables[k].getTableNumber());
            }
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
