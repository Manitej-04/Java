package com.api.RestTesting;

import static io.restassured.RestAssured.*;

import org.junit.jupiter.api.Test;

public class ApiTesting {

    @Test
    void apiTest() {

        given()
        .when()
            .get("https://jsonplaceholder.typicode.com/posts")
        .then()
            .statusCode(200);
    }
}
