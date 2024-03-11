package test;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductsIT {
    @Test
    void shouldGetProductAsJson() throws Exception {
        var response = request(getProducts()
                .header("Accept", "application/json")
                .build());

        assertEquals(200, response.statusCode());
        assertEquals("{\"id\":1,\"name\":\"Product 1\"}", response.body());
    }

    @Test
    void shouldGetProductWithoutAcceptHeader() throws Exception {
        var response = request(getProducts().build());

        assertEquals(200, response.statusCode());
    }

    private static HttpRequest.Builder getProducts() {
        return HttpRequest.newBuilder().GET().uri(URI.create("http://localhost:8080/products"));
    }

    private static HttpResponse<String> request(HttpRequest getProducts) throws IOException, InterruptedException {
        return HttpClient.newHttpClient().send(getProducts, HttpResponse.BodyHandlers.ofString());
    }
}
