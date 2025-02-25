
import java.util.ArrayList;





// Create New Inventory [From 1. Flowchart]
public class Inventory {
    private ArrayList<Stock> inventory; // ArrayList to store stock items

    public Inventory() {
        inventory = new ArrayList<>(); // Initialize the ArrayList named "inventory"
    }

    // Add Stock to Inventory
    public boolean addStock(Stock newStock) {
        // Check for duplicate EntrNo
        for (Stock stock : inventory) {
            if (stock.EntrNo == newStock.EntrNo) {
                System.out.println("\n Stock item with EntrNo " + newStock.EntrNo + " already exists. \n");
                return false; // Return false if duplicate is found
            }
        }
        inventory.add(newStock); // Add the new stock if no duplicate is found
        System.out.println("\n Stock item with EntrNo " + newStock.EntrNo + " was added successfully. \n");
        return true; // Return true if addition is successful
    }





    // Method to DELETE a stock item from the inventory based on EntrNo
    public boolean deleteStock(int entrNo) {
        for (Stock stock : inventory) {
            if (stock.EntrNo == entrNo) {
                inventory.remove(stock);
                System.out.println("\n Stock item with EntrNo " + entrNo + " was removed from the inventory. \n");
                return true; // Return true if the stock item was found and removed
            }
        }
        return false; // Return false if the stock item was not found
    }






    // Method to sort stocks by brand using Insertion Sort
    public void sortStocksByBrand() {
        System.err.println("\nStocks are sorted by Brand\n");
        for (int i = 1; i < inventory.size(); i++) {
            Stock key = inventory.get(i);
            int j = i - 1;
            while (j >= 0 && inventory.get(j).EntrName.compareTo(key.EntrName) > 0) {
                inventory.set(j + 1, inventory.get(j));
                j = j - 1;
            }
            inventory.set(j + 1, key);
        }
    }




    
    // Linear Search with EntryNumber
    public Stock searchStockByEntrNo(int entrNo) {
        for (Stock stock : inventory) {
            if (stock.EntrNo == entrNo) {
                System.out.println("\n Stock item with EntrNo " + entrNo + " was found. \n");
                return stock; // Return the stock item if found
            }
        }
        System.out.println("\n Stock item with EntrNo " + entrNo + " was not found. \n");
        return null; // Return null if the stock item was not found
    }
    
    //----get n set is used to access the private variable inventory (medyo nagegets ko na get/set)----

    // GET method (let's you READ the inventory list)
    public ArrayList<Stock> getInventory() {
        return inventory;
    }

    // SET method (let's you WRITE the inventory list)
    public void setInventory(ArrayList<Stock> inventory) {
        this.inventory = inventory;
    }

}



// Create New Stock [From 2. flowchart]
class Stock {  
    int EntrNo; 
    String EntrName; 
    String EntrDetails; 
    int ManufacturingDate;
    int Acquisition;
    float unitPrice;


    // Constructor to initialize stock attributes
    public Stock(int EntrNo, String EntrName, String EntrDetails, int ManufacturingDate, int Acquisition, float unitPrice) {
        this.EntrNo = EntrNo; 
        this.EntrName = EntrName; 
        this.EntrDetails = EntrDetails; 
        this.ManufacturingDate = ManufacturingDate;
        this.Acquisition = Acquisition; 
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return  "\n" +
                "EntrNo: " + EntrNo + "\n" +
                "EntrName: " + EntrName + "\n" + 
                "EntrDetails: " + EntrDetails + "\n" +
                "ManufacturingDate: " + ManufacturingDate + "\n" +
                "Acquisition: " + Acquisition + "\n" +
                "unitPrice: Php " + unitPrice + "\n";
    }
}


