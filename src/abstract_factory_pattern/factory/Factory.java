package abstract_factory_pattern.factory;

import abstract_factory_pattern.product.Computer;
import abstract_factory_pattern.product.Phone;

/**
 * @author totoro
 * @date 2021-09-16 16:45
 */
public interface Factory {
     Phone createPhone();
     Computer createComputer();
}
