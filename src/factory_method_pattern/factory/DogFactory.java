package factory_method_pattern.factory;

import factory_method_pattern.product.Animal;
import factory_method_pattern.product.Dog;

/**
 * @author totoro
 * @date 2021-09-16 08:47
 */
public class DogFactory implements Factory {
    @Override
    public Animal createAnimal() {
        Animal animal = new Dog();
        return animal;
    }
}
