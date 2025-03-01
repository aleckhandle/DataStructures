import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    private HashMap<String, Stock> inventory; // Hash Table to store stock items

    public Inventory() {
        inventory = new HashMap<>(); // Initialize the HashMap
    }

    // Method to generate SHA-256 hash for a given key
    private String generateHash(String key) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(key.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error generating hash", e);
        }
    }

    
    // Add Stock to Inventory
    public boolean addStock(Stock newStock) {
        String hashKey = generateHash(Integer.toString(newStock.EntrNo)); // Generate hash key
        if (inventory.containsKey(hashKey)) {
            System.out.println("\n Stock item with EntrNo " + newStock.EntrNo + " already exists. \n");
            return false; // Return false if duplicate is found
        }
        inventory.put(hashKey, newStock); // Add the new stock to the Hash Table
        System.out.println("\n Stock item with EntrNo " + newStock.EntrNo + " was added successfully. \n");
        return true; // Return true if addition is successful
    }




    // Method to DELETE a stock item from the inventory based on EntrNo
    public boolean deleteStock(int entrNo) {
        String hashKey = generateHash(Integer.toString(entrNo)); // Generate hash key
        if (inventory.containsKey(hashKey)) {
            inventory.remove(hashKey); // Remove the stock item from the Hash Table
            System.out.println("\n Stock item with EntrNo " + entrNo + " was removed from the inventory. \n");
            return true; // Return true if the stock item was found and removed
        }
        System.out.println("\n Stock item with EntrNo " + entrNo + " was not found. \n");
        return false; // Return false if the stock item was not found
    }






    // Method to sort stocks by brand using Merge Sort
    public void sortStocksByBrand() {
        ArrayList<Stock> stockList = new ArrayList<>(inventory.values()); // Convert Hash Table values to ArrayList
        mergeSort(stockList, 0, stockList.size() - 1); // Perform Merge Sort
        System.out.println("\n Stocks are sorted by Brand \n");
        for (Stock stock : stockList) {
            System.out.println(stock);
        }
    }

    // Merge Sort Algorithm
    private void mergeSort(ArrayList<Stock> list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(list, left, mid); // Sort left half
            mergeSort(list, mid + 1, right); // Sort right half
            merge(list, left, mid, right); // Merge sorted halves
        }
    }

    // Merge function for Merge Sort
    private void merge(ArrayList<Stock> list, int left, int mid, int right) {
        ArrayList<Stock> temp = new ArrayList<>();
        int i = left, j = mid + 1;
        while (i <= mid && j <= right) {
            if (list.get(i).EntrName.compareTo(list.get(j).EntrName) <= 0) {
                temp.add(list.get(i++));
            } else {
                temp.add(list.get(j++));
            }
        }
        while (i <= mid) {
            temp.add(list.get(i++));
        }
        while (j <= right) {
            temp.add(list.get(j++));
        }
        for (i = left; i <= right; i++) {
            list.set(i, temp.get(i - left));
        }
    }





    
    // Binary Search Tree Node
    class BSTNode {
        Stock stock;
        BSTNode left, right;

        public BSTNode(Stock stock) {
            this.stock = stock;
            this.left = this.right = null;
        }
    }

    // Method to insert a stock into the BST
    private BSTNode insertBST(BSTNode root, Stock stock) {
        if (root == null) {
            return new BSTNode(stock);
        }
        if (stock.EntrNo < root.stock.EntrNo) {
            root.left = insertBST(root.left, stock);
        } else {
            root.right = insertBST(root.right, stock);
        }
        return root;
    }

    // Method to search for a stock in the BST
    private Stock searchBST(BSTNode root, int entrNo) {
        if (root == null || root.stock.EntrNo == entrNo) {
            return root == null ? null : root.stock;
        }
        if (entrNo < root.stock.EntrNo) {
            return searchBST(root.left, entrNo);
        }
        return searchBST(root.right, entrNo);
    }

    // Method to search for a stock by EntrNo using BST
    public Stock searchStockByEntrNo(int entrNo) {
        BSTNode root = null;
        for (Stock stock : inventory.values()) {
            root = insertBST(root, stock); // Build the BST
        }
        Stock result = searchBST(root, entrNo); // Search the BST
        if (result != null) {
            System.out.println("\n Stock item with EntrNo " + entrNo + " was found. \n");
        } else {
            System.out.println("\n Stock item with EntrNo " + entrNo + " was not found. \n");
        }
        return result;
    }

    // GET method to READ the inventory list
    public ArrayList<Stock> getInventory() {
        return new ArrayList<>(inventory.values()); // Return inventory as ArrayList
    }

    // SET method to WRITE the inventory list
    public void setInventory(ArrayList<Stock> inventory) {
        this.inventory = new HashMap<>();
        for (Stock stock : inventory) {
            String hashKey = generateHash(Integer.toString(stock.EntrNo));
            this.inventory.put(hashKey, stock);
        }
    }
}

// Stock class remains unchanged
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
        return "\n" +
                "EntrNo: " + EntrNo + "\n" +
                "EntrName: " + EntrName + "\n" +
                "EntrDetails: " + EntrDetails + "\n" +
                "ManufacturingDate: " + ManufacturingDate + "\n" +
                "Acquisition: " + Acquisition + "\n" +
                "unitPrice: Php " + unitPrice + "\n";
    }
}