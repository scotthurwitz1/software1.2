package Model;

import javafx.collections.ObservableList;

public class Inventory {
    // Declare Fields
    private ObservableList<Part> allParts;
    private ObservableList<Product> allProducts;

    // Declare Methods
    public void addPart(Part newPart) {}
    public void addProduct(Product newProduct){}
    public Part lookupPart(int partId){
        return null;
    }
    public Product lookupProduct(int productId){
        return null;
    }
    public ObservableList<Part> lookupPart(String partName){
        return null;
    }
    public ObservableList<Product> lookupProduct(String productName){
        return null;
    }
    public void updatePart(int index, Part selectedPart){}
    public void updateProduct(int index, Product newProduct){}
    public boolean deletePart(Part selectedPart){
        return false;
    }
    public boolean deleteProduct(Product selectedProduct){
        return false;
    }
    public ObservableList<Part> getAllParts() {
        return null;
    }
    public ObservableList<Product> getAllProducts() {
        return null;
    }
}
