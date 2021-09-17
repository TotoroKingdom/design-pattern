package abstract_factory_pattern;

import abstract_factory_pattern.factory.Factory;
import abstract_factory_pattern.product.Computer;
import abstract_factory_pattern.product.Phone;
import util.XMLUtil;

/**
 * @author totoro
 * @date 2021-09-16 16:52
 */
public class Client {
    public static void main(String[] args) {
        Factory factory;
        Phone phone;
        Computer computer;
        factory = (Factory) XMLUtil.getBean();
        Phone factoryPhone = factory.createPhone();
        Computer factoryComputer = factory.createComputer();
        factoryPhone.call();
        factoryComputer.show();
    }
}
