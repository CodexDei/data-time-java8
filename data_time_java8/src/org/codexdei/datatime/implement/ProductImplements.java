package org.codexdei.datatime.implement;

import org.codexdei.datatime.interfaces.ProductManageable;
import org.codexdei.datatime.models.IsDiscount;
import org.codexdei.datatime.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductImplements implements ProductManageable<Product> {

    List<Product> productList = new ArrayList<>();

    @Override
    public void addElement(Product product){

        productList.add(product);
    }

    @Override
    public Optional<Product> searchElementName(String productSearch) {

        return productList.stream()
                .filter(product -> product.getNameProduct().equalsIgnoreCase(productSearch))
                .findFirst()
                ;
    }

    @Override
    public void listProduct() {

        productList.forEach(System.out::println);
    }

    @Override
    public void calculateDiscount() {

        System.out.println("CALCULATE DISCOUNT:");

        List<String> productsDiscountList = productList.stream()
                .filter(isProduct -> isProduct.isDiscount() == IsDiscount.WITH_DISCOUNT)
                .map(productDiscount ->
                        productDiscount.getNameProduct() + "\n" +
                                "Original price: " + productDiscount.getPriceProduct() + "\n" +
                                "Discount:" + productDiscount.getPriceProduct() * 0.10 + "\n" +
                                "Total:" + (productDiscount.getPriceProduct() - productDiscount.getPriceProduct() * 0.10 + "\n"))
                .toList();

        productsDiscountList.forEach(System.out::println);

    }
}
