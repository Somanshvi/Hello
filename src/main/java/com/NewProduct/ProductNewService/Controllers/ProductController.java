package com.NewProduct.ProductNewService.Controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/Products")

public class ProductController {
    @GetMapping("Hello")
    public String helloWorld() {
        return "Hello World";

    }

    @GetMapping("Hello/{name}")
    public String helloWorld(@PathVariable String name) {
        return "Hello World " + name;
    }
    @GetMapping("/Show/{Show}/ShowId/{ShowId}")
    public String bmsExample(@PathVariable String Show ,@PathVariable int ShowId){
        return  "Hello"+Show +" "+ShowId;

    }
    /*public ResponseEntity<String> getProductById(@RequestParam() String ) {
        System.out.println("ProductId: " + ProductId);
        return new ResponseEntity<String>("product_id"+ ProductId,HttpStatusCode.valueOf(200));

    }*/
}
