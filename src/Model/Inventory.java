package Model;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Product> products = new ArrayList();
    private List<Part> parts = new ArrayList();

    public Inventory() {
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public boolean removeProduct(int productID) {
        boolean removed = false;
        Iterator iter = this.products.iterator();

        while(iter.hasNext()) {
            if (((Product)iter.next()).getProductID() == productID) {
                iter.remove();
                removed = true;
                break;
            }
        }

        return removed;
    }

    public Product lookupProduct(int productID) {
        Product ret = null;
        Iterator var3 = this.products.iterator();

        while(var3.hasNext()) {
            Product p = (Product)var3.next();
            if (p.getProductID() == productID) {
                ret = p;
                break;
            }
        }

        if (ret == null) {
            throw new RuntimeException("No product found with id: " + productID);
        } else {
            return ret;
        }
    }

    public void updateProduct(int count) {
    }

    public void addPart(Part p) {
        this.parts.add(p);
    }

    public boolean deletePart(int partID) {
        boolean removed = false;
        Iterator iter = this.parts.iterator();

        while(iter.hasNext()) {
            if (((Part)iter.next()).getPartID() == partID) {
                iter.remove();
                removed = true;
            }
        }

        return removed;
    }

    public Part lookupPart(int partID) {
        return null;
    }

    public void updatePart(int partID) {
    }
}
