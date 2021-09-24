package mediator_pattern;

/**
 * @author totoro
 * @date 2021-09-24 16:35
 */
public class List extends Componect{
    @Override
    public void update() {
        System.out.println("列表框增加一项: 张无忌");
    }

    public void select(){
        System.out.println("列表框选中项： 小龙女");
    }
}
