package mediator_pattern;

/**
 * @author totoro
 * @date 2021-09-24 16:35
 */
public class TextBox extends Componect{
    @Override
    public void update() {
        System.out.println("客户信息增加成功后文本框清空。");
    }
    public void setText(){
        System.out.println("文本框显示：小龙女。");
    }
}
