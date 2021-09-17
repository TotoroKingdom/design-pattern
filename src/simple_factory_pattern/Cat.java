package simple_factory_pattern;

/**
 * @author totoro
 * @date 2021-09-15 16:34
 */
public class Cat implements Animal{
    @Override
    public void run() {
        System.out.println("小猫跑得快");
    }

    public Cat(){
        System.out.println("喵喵喵-------------");
    }
}
