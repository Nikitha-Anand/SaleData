public class SaleData {
    private String ID;
    private Integer Quantity;
    public SaleData(String ID, Integer Quantity){
        this.ID = ID;
        this.Quantity = Quantity;
    }

    public static SaleData[] CircularQueue = new SaleData[5];
    public static Integer Head = 0;
    public static Integer Tail = 0;
    public static Integer NumberOfItems = 0;

    static {
        for (int i = 0; i < 5; i++) {
            CircularQueue[i] = new SaleData("",-1);
        }
    }

    public static Integer Enqueue(SaleData data){
        if(NumberOfItems >= 5){
            return -1;
        } else{
            CircularQueue[Tail] = data;
            Tail = Tail + 1;
            NumberOfItems = NumberOfItems + 1;
            return 1;
        }
    }

    public static SaleData Dequeue(){
        if (NumberOfItems == 0) {
            return null;
        } else {
            if (Tail == 5) {
                Tail = Head;
            }
            Head = Head + 1;
            NumberOfItems = NumberOfItems - 1;
            return CircularQueue[Head - 1];
        }
    }

    public static void EnterRecord(String id, Integer quantity){
        SaleData data = new SaleData(id, quantity);
        Integer result = Enqueue(data);
        if (result == 1){
            System.out.println("Stored");
        } else{
            System.out.println("Full");
        }
    }

    public static void main(String[] args){
        EnterRecord("ADF",10);
        EnterRecord("OOP",1);
        EnterRecord("BXW",5);
        EnterRecord("XXZ",22);
        EnterRecord("HQR",6);
        EnterRecord("LLP",3);

        SaleData data;
        if ((data = Dequeue()) == null){
            System.out.println("Queue is Empty");
        } else{
            System.out.println("ID: " + data.ID + "  Quantity: " + data.Quantity);
        }

        EnterRecord("LLP",3);

        if (Head < Tail) {
            for (int i = Head; i < Tail; i++) {
                System.out.println("ID: " + CircularQueue[i].ID + "  Quantity: " + CircularQueue[i].Quantity);
            }
        } else {
            for (int i = Head; i < 5; i++) {
                System.out.println("ID: " + CircularQueue[i].ID + "  Quantity: " + CircularQueue[i].Quantity);
            }
            for (int i = 0; i < Head; i++) {
                System.out.println("ID: " + CircularQueue[i].ID + "  Quantity: " + CircularQueue[i].Quantity);
            }
        }
    }
}
