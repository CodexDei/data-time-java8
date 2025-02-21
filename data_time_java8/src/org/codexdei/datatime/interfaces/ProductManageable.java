package org.codexdei.datatime.interfaces;

import java.util.List;
import java.util.Optional;

public interface ProductManageable<T> {

    void addElement(T element);
    Optional<T> searchElementName(String searchElement);
    void listProduct();
    void calculateDiscount();
}

