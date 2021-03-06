package mediator_pattern;


/**
 * @author totoro
 * @date 2021-09-24 16:44
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator;
        mediator = new ConcreteMediator();

        Button addBT = new Button();
        List list = new List();
        ComboBox cb = new ComboBox();
        TextBox userNameTB = new TextBox();

        addBT.setMediator(mediator);
        list.setMediator(mediator);
        cb.setMediator(mediator);
        userNameTB.setMediator(mediator);

        mediator.addButton = addBT;
        mediator.list=list;
        mediator.cb=cb;
        mediator.userNameTextBox = userNameTB;

        addBT.changed();
        System.out.println("--------------------------------------------------");
        list.changed();

    }
}
