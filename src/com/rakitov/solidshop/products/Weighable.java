package com.rakitov.solidshop.products;

/**
 * When a product is weighable, it can be measured in grams.
 *
 * @author Stanislav Rakitov
 */
@FunctionalInterface
public interface Weighable {

  /**
   * Returns the weight of the product in grams.
   *
   * @return the weight of the product in grams
   */
  int getWeight();
}
