package abstract_factory_pattern.product;

/**
 * @author totoro
 * @date 2021-09-16 16:43
 */
public class ApplePhone implements Phone{
    @Override
    public void call() {
        System.out.println("苹果手机");
    }
}
