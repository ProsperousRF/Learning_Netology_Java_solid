package com.rakitov.solidshop.products;

/**
 * An interface for expirable products.
 *
 * @author Stanislav Rakitov
 */
@FunctionalInterface
public interface Expirable {

  /**
   * Checks if the product is expired.
   *
   * @return true if the product is expired, false otherwise
   */
  boolean isExpired();
}
