public class StockItem{
    private String name;
    private int quantity;

    public StockItem(String name,int initialStock){
        if(initialStock<0) throw new IllegalArgumentException("Initial stock cannot be negative.");
        this.name=name;
        this.quantity=initialStock;
    }
    public void restock(int amount){
        if(amount<=0) throw new IllegalArgumentException("Restock amount must be positive.");
        quantity+=amount;
    }
    public void sell(int amount){
        if(amount<=0) throw new IllegalArgumentException("Sell amount must be positive.");
        if(amount>quantity) throw new IllegalArgumentException("Not enough stock to sell.");
        quantity-=amount;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getName(){
        return name;
    }
}
