package simple_factory_pattern;

/**
 * @author totoro
 * @date 2021-09-15 16:36
 */
public class Factory {
    public static Animal getAnimal(String type){
        Animal animal = null;
        if (type.equalsIgnoreCase("cat")){
            animal = new Cat();
            System.out.println("cat init------------");
        }else if (type.equalsIgnoreCase("dog")){
            animal = new Dog();
            System.out.println("dog init-------------");
        }
        return animal;
    }

}
