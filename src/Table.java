public class Table {

    //assuming that every table can sit 5 clients
    private boolean free ;
    private String order;
    private int tableNumber;
    private double billTotal;
    private int  clientsPerTable;

    public Table(boolean free, String order, int tableNumber, double billTotal,  int clientsPerTable) {
        this.free = free;
        this.order = order;
        this.tableNumber = tableNumber;
        this.billTotal  = billTotal;
        this.clientsPerTable =clientsPerTable;
    }

    public int getClientsPerTable() {
        return clientsPerTable;
    }

    public void setClientsPerTable(int clientsPerTable) {
        this.clientsPerTable = clientsPerTable;
    }

    public boolean getFree(){
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void cleanOrder(){

    }
    public void getOrder(){

    }
    public String isFree(){
        if (free == true);
        return "Table " + tableNumber + " is free";

    }
    public void occupy(){
        free=false;

    }
    public void saveOrder(){

    }
    public void unOccupy(){
        free  = true;

    }

}
