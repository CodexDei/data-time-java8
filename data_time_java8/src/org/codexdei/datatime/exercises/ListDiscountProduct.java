package org.codexdei.datatime.exercises;

import org.codexdei.datatime.implement.ProductImplements;
import org.codexdei.datatime.interfaces.ProductManageable;
import org.codexdei.datatime.models.Appliance;
import org.codexdei.datatime.models.Clothes;
import org.codexdei.datatime.models.IsDiscount;
import org.codexdei.datatime.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ListDiscountProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductManageable productManageable = new ProductImplements();

        productManageable.addElement(new Appliance("Refrigerator",200, IsDiscount.WITH_DISCOUNT));
        productManageable.addElement(new Appliance("Stove",100, IsDiscount.WITH_DISCOUNT));
        productManageable.addElement(new Clothes("Shirt",10, IsDiscount.FULL_PRICE));
        productManageable.addElement(new Clothes("Pant",12, IsDiscount.FULL_PRICE));

        productManageable.listProduct();

        productManageable.calculateDiscount();

        System.out.println("Search product:");
        String productSearch = sc.nextLine();

        Optional<Product> searchProduct = productManageable.searchElementName(productSearch);

        searchProduct.ifPresentOrElse(p ->
                        System.out.println("Exist product? = " + p),
                () -> System.out.println("Producto not exist")
        );
    }
}
