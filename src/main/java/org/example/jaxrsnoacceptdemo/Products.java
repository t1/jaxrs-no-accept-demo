package org.example.jaxrsnoacceptdemo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/products")
public class Products {
    @GET
    public Product product() {
        return new Product(1, "Product 1");
    }
}
