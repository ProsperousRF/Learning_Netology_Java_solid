package com.rakitov.solidshop.cart;

import com.rakitov.solidshop.products.Product;

import java.util.List;

/**
 * Базовый интерфейс для корзины
 *
 * @author Stanislav Rakitov
 */
public interface ShoppingCart {
  /** Добавление товара в корзину */
  void addProduct(Product product);

  /** Удаление товара из корзины */
  void removeProduct(Product product);

  /** Получение списка товаров в корзине */
  List<Product> getProducts();

  /** Очистка корзины */
  void clearCart();

  /** Получение количества товаров в корзине */
  int getNumberOfProducts();
}
