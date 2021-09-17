package abstract_factory_pattern.product;

/**
 * @author totoro
 * @date 2021-09-16 16:44
 */
public class XiaoMiPhone implements Phone{
    @Override
    public void call() {
        System.out.println("小米手机");
    }
}
