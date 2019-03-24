package model.thing.hero.commond;

import ui.frame.BattleFrame;
import util.FileUtil;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/24
 */
public class CommandInvoker {

    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void invoke(){
        command.execute();
        FileUtil.writeFile(BattleFrame.COMMAND_FILE_NAME, command.toString());
    }

}
