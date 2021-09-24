package command_pattern;

/**
 * @author totoro
 * @date 2021-09-24 15:49
 */
public class ExitCommand extends Command{

    private SystemExitClass seObj;

    public ExitCommand() {
        seObj = new SystemExitClass();
    }

    @Override
    public void execute(){
        seObj.exit();
    }
}
