package abstract_factory_pattern.factory;

import abstract_factory_pattern.product.Computer;
import abstract_factory_pattern.product.Phone;
import abstract_factory_pattern.product.XiaoMIComputer;
import abstract_factory_pattern.product.XiaoMiPhone;

/**
 * @author totoro
 * @date 2021-09-16 16:50
 */
public class XiaoMiFactory implements Factory{
    @Override
    public Phone createPhone() {
        XiaoMiPhone xiaoMiPhone = new XiaoMiPhone();
        return xiaoMiPhone;
    }

    @Override
    public Computer createComputer() {
        return new XiaoMIComputer();
    }
}
