public class Table {

    //assuming that every table can sit 5 clients
    private boolean free ;
    private String order;
    private int tableNumber;

    public Table(boolean free, String order, int tableNumber) {
        this.free = free;
        this.order = order;
        this.tableNumber = tableNumber;
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

    }

}
