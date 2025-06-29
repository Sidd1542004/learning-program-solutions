import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StockItemTest{
    @Test
    void testInitialStock(){
        StockItem item=new StockItem("Pen",100);
        assertEquals(100,item.getQuantity());
    }
    @Test
    void testRestock(){
        StockItem item=new StockItem("Notebook",50);
        item.restock(20);
        assertEquals(70,item.getQuantity());
    }
    @Test
    void testSell(){
        StockItem item=new StockItem("Marker",30);
        item.sell(10);
        assertEquals(20,item.getQuantity());
    }
    @Test
    void testSellMoreThanStock(){
        StockItem item=new StockItem("Eraser",5);
        assertThrows(IllegalArgumentException.class,()->item.sell(10));
    }
    @Test
    void testRestockWithNegativeAmount(){
        StockItem item=new StockItem("Paper",10);
        assertThrows(IllegalArgumentException.class,()-> item.restock(-5));
    }
    @Test
    void testSellWithZeroAmount() {
        StockItem item = new StockItem("Glue",10);
        assertThrows(IllegalArgumentException.class,()-> item.sell(0));
    }
}
