import ui.MainUi;

import javax.swing.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/18
 */
public class Main {

    public static void main(String[] args){
        SwingUtilities.invokeLater(MainUi::new);
    }

}
