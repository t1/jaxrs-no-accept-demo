Reproducer for WildFly failing with `500 Internal Server Error` when requesting without an `Accept` header.

Just run `mvn verify` and you will see the error in `ProductsIT#shouldGetProductWithoutAcceptHeader`.
