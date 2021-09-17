package factory_method_pattern.factory;

import factory_method_pattern.product.Animal;

/**
 * @author totoro
 * @date 2021-09-16 08:47
 */
public interface Factory {
    public Animal createAnimal();
}
