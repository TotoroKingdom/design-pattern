package command_pattern;

/**
 * @author totoro
 * @date 2021-09-24 15:47
 */
public class FunctionButton {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void click(){
        System.out.println("单机功能键：");
        command.execute();
    }
}
