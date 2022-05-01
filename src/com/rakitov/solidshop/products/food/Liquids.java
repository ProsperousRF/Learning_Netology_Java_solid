package com.rakitov.solidshop.products.food;

/**
 * A functional interface for liquid products that have a volume in ml.
 *
 * @author Stanislav Rakitov
 */
@FunctionalInterface
public interface Liquids {

  /**
   * Returns the volume of the liquid in milliliters
   *
   * @return the volume of the liquid in milliliters
   */
  int getVolume();
}
