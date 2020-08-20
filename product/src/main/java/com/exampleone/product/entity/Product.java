package com.exampleone.product.entity;

public class Product {
    // 商品ID
    private int productId;
    // 商品英文名称
    private String productEname;
    // 商品中文名称
    private String productCname;
    // 商品数量
    private int productQuantity;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productEname='" + productEname + '\'' +
                ", productCname='" + productCname + '\'' +
                ", productQuantity=" + productQuantity +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductEname() {
        return productEname;
    }

    public void setProductEname(String productEname) {
        this.productEname = productEname;
    }

    public String getProductCname() {
        return productCname;
    }

    public void setProductCname(String productCname) {
        this.productCname = productCname;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}
