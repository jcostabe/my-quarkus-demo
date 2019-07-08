package com.jcostabe.example.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ControllerResourceTest {

    @Test
    public void testisAliveEndpoint() {
        given()
          .when().get("/api/v1/isAlive")
          .then()
             .statusCode(200)
             .body(is("Application alive & running"));
    }

}