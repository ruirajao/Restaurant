public class Client {

    private int tableNumber;
    private int clientNumber;

    public Client(int tableNumber, int clientNumber) {
        this.tableNumber = tableNumber;
        this.clientNumber = clientNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String askForTable() {
        return "I need a table";
    }

    public String order() {
        return "Ordering";

    }

    public void pay() {

    }

    public void setRestaurant() {

    }

    private void checkRestaurantPresence() {
    }
}
