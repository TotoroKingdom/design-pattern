package abstract_factory_pattern.factory;

import abstract_factory_pattern.product.AppleComputer;
import abstract_factory_pattern.product.ApplePhone;
import abstract_factory_pattern.product.Computer;
import abstract_factory_pattern.product.Phone;

/**
 * @author totoro
 * @date 2021-09-16 16:49
 */
public class AppleFactory implements Factory{
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Computer createComputer() {
        return new AppleComputer();
    }
}
