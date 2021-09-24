package mediator_pattern;

/**
 * @author totoro
 * @date 2021-09-24 16:35
 */
public class ComboBox extends Componect{
    @Override
    public void update() {
        System.out.println("组合框增加一项：张无忌");
    }

    public void select(){
        System.out.println("组合框选中项：小龙女");
    }
}
