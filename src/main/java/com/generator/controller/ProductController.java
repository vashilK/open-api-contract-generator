package com.generator.controller;

import com.generator.model.Product;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

/**
 * Sample controller to show how the contract can be defined.
 */
@Path("/products")
public class ProductController {


    @POST
    @Path("/save")
    @APIResponses(value = {
            @APIResponse(responseCode = "201", description = "Created"),
            @APIResponse(responseCode = "400", description = "Bad Request"),
            @APIResponse(responseCode = "412", description = "The product contains an invalid field(s)."),
            @APIResponse(responseCode = "500", description = "The product could not be created.")
    })
    public void createProduct(Product product) {
        // TODO
    }
}
