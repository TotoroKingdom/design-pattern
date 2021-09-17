package factory_method_pattern.factory;

import factory_method_pattern.product.Animal;
import factory_method_pattern.product.Cat;

/**
 * @author totoro
 * @date 2021-09-16 08:47
 */
public class CatFactory implements Factory {
    @Override
    public Animal createAnimal() {
        Animal animal = new Cat();
        return animal;
    }
}
