package com.exampleone.product.controller;

import com.exampleone.product.entity.Product;
import com.exampleone.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product", method = RequestMethod.GET)
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "queryAllProduct")
    public List<Product> queryAllProduct(){
        return productService.queryAllProduct();
    }

    @RequestMapping(value = "queryProductByProductid")
    @ResponseBody
    public List<Product> queryProductByProductid(int productId){
        return productService.queryProductByProductid(productId);
    }

    @PostMapping(value = "insertProduct")
    public Product insertProduct(Product product){
        return productService.insertProduct(product);
    }

    @RequestMapping(value = "updateProduct", method = RequestMethod.PUT)
    public int updateProduct(Product product){
        return productService.updateProduct(product);
    }

    @RequestMapping(value = "deleteProduct", method = RequestMethod.DELETE)
    public int deleteProduct(int productId){
        return productService.deleteProduct(productId);
    }
}
