package factory_method_pattern;

import factory_method_pattern.factory.CatFactory;
import factory_method_pattern.factory.Factory;
import factory_method_pattern.product.Animal;
import util.XMLUtil;

/**
 * @author totoro
 * @date 2021-09-16 08:47
 */
public class Client {
    public static void main(String[] args) {
        Factory factory;
        Animal animal;
        factory = (Factory) XMLUtil.getBean();
        animal = factory.createAnimal();
        animal.run();
    }
}
