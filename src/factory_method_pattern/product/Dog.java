package factory_method_pattern.product;

import factory_method_pattern.product.Animal;

/**
 * @author totoro
 * @date 2021-09-16 08:45
 */
public class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("小狗跑得快-----------------");
    }
}
