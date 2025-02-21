package org.codexdei.datatime.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Product {

    protected String nameProduct;
    protected double priceProduct;
    protected IsDiscount isDiscount;
    protected LocalDateTime dateCreation;

    public Product(String nameProduct, double priceProducto, IsDiscount isDiscount){

        this.nameProduct = nameProduct;
        this.priceProduct = priceProducto;
        this.isDiscount = isDiscount;
        this.dateCreation = LocalDateTime.now();
    }

    public String getNameProduct(){

        return this.nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public IsDiscount isDiscount() {
        return isDiscount;
    }

    public void setDiscount(IsDiscount discount) {
        isDiscount = discount;
    }

    @Override
    public String toString() {
        return  nameProduct + " || " +
                "Price Producto: " + priceProduct + " || " +
                "Date Creation:" + dateCreation;
    }
}
