public class InvMain {
    public static void main(String[] args) {
        Inventory myInventory = new Inventory();

        Stock stock1 = new Stock(1, "Yamaha SR 250 SE", "XSR155", 2022, 2023, 185000);
        myInventory.addStock(stock1);

        Stock stock2 = new Stock(2, "Kawasaki Eliminator 125", "Allround / Single cylinder, four-stroke", 2005, 2020, 22582);
        myInventory.addStock(stock2);

        Stock stock3 = new Stock(3, "Honda CRF450RX", "Allround / Single cylinder, four-stroke", 2005, 2020, 22582);
        myInventory.addStock(stock3);

        Stock stock4 = new Stock(4, "Tank Sports Urban Sporty 150", "Allround / Single cylinder, four-stroke", 2005, 2020, 22582);
        myInventory.addStock(stock4);

        Stock stock5 = new Stock(5, "AJS Modena 125", "Allround / Single cylinder, four-stroke", 2005, 2020, 22582);
        myInventory.addStock(stock5);




        
        myInventory.deleteStock(1); // Delete a stock
        System.out.println(myInventory.getInventory()); // Print inventory

        myInventory.sortStocksByBrand(); // Sort stocks by brand
        System.out.println(myInventory.getInventory()); // Print sorted inventory

        System.out.println(myInventory.searchStockByEntrNo(2)); // Search for a stock
    }
}