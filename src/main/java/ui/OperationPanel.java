package ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/18
 */
public class OperationPanel extends JPanel{

    private JButton[] directionButton = new JButton[4];
    private String[] directionStr = {"上", "下", "左", "右"};

    public OperationPanel() {
        this.setBounds(800, 400, 200, 200);
        this.setLayout(null);
        this.setBackground(new Color(91, 213, 255));

        configButton();

        this.setVisible(true);
    }
    private void configButton(){
        for(int i=0; i<directionButton.length; i++){
            directionButton[i] = new JButton();
            directionButton[i].setText(directionStr[i]);

            int x = i < 2 ? 75: 25 + 100 * (i-2);
            int y = i < 2 ? 25 + 100 * i: 75;
            int size = 50;
            directionButton[i].setBounds(x, y, size, size);
            this.add(directionButton[i]);
        }

    }



}
