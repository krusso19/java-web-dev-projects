package org.launchcode;

public class MenuItem {
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;

    public MenuItem(Double p, String d, String c, Boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}

