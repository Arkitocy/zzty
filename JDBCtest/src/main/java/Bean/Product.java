package Bean;

import java.util.Date;

public class Product {
    private int id;
    private String name;
    private String category;
    private Date productiondate;
    private Date outdate;

    public Product(String name, String category, Date productiondate, Date outdate) {
        this.name = name;
        this.category = category;
        this.productiondate = productiondate;
        this.outdate = outdate;
    }

    public Product( ) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getProductiondate() {
        return productiondate;
    }

    public void setProductiondate(Date productiondate) {
        this.productiondate = productiondate;
    }

    public Date getOutdate() {
        return outdate;
    }

    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }
}
