package command_pattern;

/**
 * @author totoro
 * @date 2021-09-24 15:52
 */
public class HelpCommand extends Command{
    private DisplayHelpClass hcObj;

    public HelpCommand(){
        hcObj = new DisplayHelpClass();
    }

    @Override
    public void execute() {
        hcObj.display();
    }
}
