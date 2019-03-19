package ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/18
 */
public class RolePanel extends JPanel{

    private JLabel[] roleLabel = new JLabel[6];
    private JLabel[] valueLabel = new JLabel[6];
    private String[] roleStr = {"角色", "金币",  "经验", "生命值", "攻击值", "防守值"};
    private String[] valueStr = {"法师", "100", "10", "10", "10", "10"};

    public RolePanel() {
        this.setBounds(800, 0, 200, 200);
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
            int y = 10 + 30 * i;
            int width = 50;
            int height = 30;

            roleLabel[i].setBounds(roleX, y, width, height);
            valueLabel[i].setBounds(valueX, y, width, height);
            this.add(roleLabel[i]);
            this.add(valueLabel[i]);
        }

    }


}
