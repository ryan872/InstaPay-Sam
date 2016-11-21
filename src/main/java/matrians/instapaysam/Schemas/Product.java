package matrians.instapaysam.Schemas;

/**
 * Team Matrians
 */
public class Product {
    public long id;
    public String name;
    public float price;
    public String err;
    public boolean success;

    public Product(long id) {
        this.id = id;
        success = false;
        err = "";
        name = "";
    }
}