public class Table {

    //assuming that every table can sit 5 clients
    private boolean free;
    private String order;
    private int tableNumber;

    public Table(boolean free, String order, int tableNumber) {
        this.free = free;
        this.order = order;
        this.tableNumber = tableNumber;
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
    public boolean isFree(){
        free = true;
        return true;

    }
    public void occupy(){

    }
    public void saveOrder(){

    }
    public void unOccupy(){

    }

}
