package adapter_pattern;

/**
 * @author totoro
 * @date 2021-09-23 11:29
 */
public abstract class CarController {
    public void move(){
        System.out.println("玩具汽车跑起来！ ");
    }

    public abstract void phonate();
    public abstract void twinkle();
}
