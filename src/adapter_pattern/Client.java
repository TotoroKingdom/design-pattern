package adapter_pattern;

import util.XMLUtil;

/**
 * @author totoro
 * @date 2021-09-23 11:36
 */
public class Client {
    public static void main(String[] args) {
        CarController car;
        car = (CarController) XMLUtil.getBean();

        car.move();
        car.phonate();
        car.twinkle();
    }
}
