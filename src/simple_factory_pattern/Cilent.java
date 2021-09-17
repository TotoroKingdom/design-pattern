package simple_factory_pattern;

/**
 * @author totoro
 * @date 2021-09-15 16:50
 */
public class Cilent {
    public static void main(String[] args) {
        Animal animal;
        animal = Factory.getAnimal("dog");
        animal.run();
        Animal cat = Factory.getAnimal("cat");
        cat.run();
        System.out.println("--------------------------------");
    }
}
