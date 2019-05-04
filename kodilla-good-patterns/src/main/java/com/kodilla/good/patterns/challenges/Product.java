package com.kodilla.good.patterns.challenges;

public class Product {
    private final int productID;
    private final String productName;
    private final double price;

    public Product(final int productID, final String productName, final double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return productID == product.productID;

    }

    @Override
    public int hashCode() {
        return productID;
    }

    @Override
    public String toString() {
        return "ID: " + productID + " name: " + productName;
    }
}
