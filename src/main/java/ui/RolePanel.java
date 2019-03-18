package ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/18
 */
public class RolePanel extends JPanel{

    private JLabel[] roleLabel = new JLabel[3];
    private JLabel[] valueLabel = new JLabel[3];
    private String[] roleStr = {"角色", "攻击值", "防守值"};
    private String[] valueStr = {"法师", "10", "10"};

    public RolePanel() {
        this.setBounds(800, 0, 200, 400);
        this.setLayout(null);
        this.setBackground(new Color(186, 231, 255));

        configHint();

        this.setVisible(true);
    }

    private void configHint(){
        for(int i = 0; i< roleLabel.length; i++){
            roleLabel[i] = new JLabel();
            roleLabel[i].setText(roleStr[i]);

            valueLabel[i] = new JLabel();
            valueLabel[i].setText(valueStr[i]);

            int roleX = 30;
            int valueX = 110;
            int y = 20 + 40 * i;
            int width = 60;
            int height = 40;

            roleLabel[i].setBounds(roleX, y, width, height);
            valueLabel[i].setBounds(valueX, y, width, height);
            this.add(roleLabel[i]);
            this.add(valueLabel[i]);
        }

    }


}
