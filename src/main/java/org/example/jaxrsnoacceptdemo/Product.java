package org.example.jaxrsnoacceptdemo;

@SuppressWarnings("unused")
public class Product {
    private Integer id;
    private String name;

    public Product() {}

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
