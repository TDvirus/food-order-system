package com.exampleone.product.service;

import com.exampleone.product.entity.Product;
import com.exampleone.product.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public List<Product> queryAllProduct() {
        return productMapper.queryAllProduct();
    }

    public List<Product> queryProductByProductid(int productId) {
        return productMapper.queryProductByProductid(productId);
    }

    public Product insertProduct(Product product) {
        productMapper.insertProduct(product);
        return product;
    }

    public int updateProduct(Product product) {
        return productMapper.updateProduct(product);
    }

    public int deleteProduct(int productId) {
        return productMapper.deleteProduct(productId);
    }
}
