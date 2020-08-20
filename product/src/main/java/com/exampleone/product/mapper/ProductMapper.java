package com.exampleone.product.mapper;

import com.exampleone.product.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    public List<Product> queryAllProduct();
    List<Product> queryProductByProductid(int productId);
    public int insertProduct(Product product);
    public int updateProduct(Product product);
    public int deleteProduct(int productId);
}
