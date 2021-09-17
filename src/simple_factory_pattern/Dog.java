package simple_factory_pattern;

/**
 * @author totoro
 * @date 2021-09-15 16:34
 */
public class Dog implements Animal{
    @Override
    public void run() {
        System.out.println("小狗跑得快-----------");
    }

    public Dog(){
        System.out.println("汪汪队立大功--------------");
    }
}
