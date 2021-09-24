package command_pattern;

import util.XMLUtil;

/**
 * @author totoro
 * @date 2021-09-24 15:55
 */
public class Client {
    public static void main(String[] args) {
        FunctionButton fb = new FunctionButton();
        Command command;
        command = (Command) XMLUtil.getBean();
        fb.setCommand(command);
        fb.click();
    }
}
