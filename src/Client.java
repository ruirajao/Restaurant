public class Client {

    private int tableNumber;
    private int clientNumber;
    private float bill;

    public Client(int tableNumber, int clientNumber) {
        this.tableNumber = tableNumber;
        this.clientNumber = clientNumber;
    }

    public float getBill() {
        return bill;
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
        return "Client " + clientNumber + " needs a table";
    }

    public String order() {
        return "Client " + clientNumber + "ordering";

    }

    public String pay() {
        bill = 0;
        return "Bill has been payed";

    }

    public void setRestaurant() {

    }

    private void checkRestaurantPresence() {
    }
}
