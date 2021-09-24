package mediator_pattern;

/**
 * @author totoro
 * @date 2021-09-24 16:33
 */
public class ConcreteMediator extends Mediator{
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox cb;

    @Override
    public void componentChanged(Componect c) {
        if (c.equals(addButton)){
            System.out.println("--单机增加按钮--");
            list.update();
            cb.update();
            userNameTextBox.update();
        }
        else if(c.equals(list)){
            System.out.println("--从列表狂选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
        else if(c.equals(cb)){
            System.out.println("--从组合框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
    }
}
