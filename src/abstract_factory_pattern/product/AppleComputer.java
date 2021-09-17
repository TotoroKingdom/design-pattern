package abstract_factory_pattern.product;

/**
 * @author totoro
 * @date 2021-09-16 16:43
 */
public class AppleComputer implements Computer{
    @Override
    public void show() {
        System.out.println("苹果电脑");
    }
}
