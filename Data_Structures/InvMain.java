


public class InvMain {
    public static void main(String[] args) { //this main method is used to test the Inventory class
        
        Inventory myInventory = new Inventory();  
    
        Stock stock1 = new Stock(1, "Yamaha SR 250 SE", "XSR155", 2022, 2023, 185000 ); // Create a new stock item
        myInventory.addStock(stock1); // Add stock item to inventory
    
        Stock stock2 = new Stock(2, "Kawasaki Eliminator 125", "Allround / Single cylinder, four-stroke", 2005, 2020, 22582 ); // Create a new stock item
        myInventory.addStock(stock2); // Add stock item to inventory

        Stock stock3 = new Stock(3, "Honda CRF450RX", "Allround / Single cylinder, four-stroke", 2005, 2020, 22582 ); // Create a new stock item
        myInventory.addStock(stock3);

        Stock stock4 = new Stock(4, "Tank Sports Urban Sporty 150", "Allround / Single cylinder, four-stroke", 2005, 2020, 22582 ); // Create a new stock item
        myInventory.addStock(stock4);

        Stock stock5 = new Stock(5, "AJS Modena 125", "Allround / Single cylinder, four-stroke", 2005, 2020, 22582 ); // Create a new stock item
        myInventory.addStock(stock5);



        //System.out.println(myInventory.getInventory()); //getInventory() to READ the inventory list

       // myInventory.deleteStock(1); // Remove stock item from inventory
        //System.out.println(myInventory.getInventory()); //getInventory() to READ the inventory list

       // myInventory.sortStocksByBrand();
       // System.out.println(myInventory.getInventory()); 

       //System.out.println(myInventory.searchStockByEntrNo(2));

    }
}
