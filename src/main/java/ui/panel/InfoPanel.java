package ui.panel;

import model.hero.AbstractHero;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/18
 */
public class InfoPanel extends JPanel implements Observer{

    private AbstractHero hero;

    private JLabel[] titleLabel = new JLabel[3];
    private String[] titleStr = { "武器", "技能", "装备"};

    private JLabel[] keyNameLabel = new JLabel[3];
    private String[] keyName = {"黄钥匙", "蓝钥匙", "红钥匙"};

    private JLabel[] keyValueLabel = new JLabel[3];
    private int[] keyValue = {1, 1, 1};

    public InfoPanel(AbstractHero hero) {
        this.hero = hero;
        this.hero.addObserver(this);

        this.setBounds(0, 400, 800, 200);
        this.setLayout(null);
        this.setBackground(new Color(230, 247, 255));

        configTitleLabel();
        configKeyLabel();

        this.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("InfoPanel: I know that I should update");
    }

    private void configTitleLabel(){
        for(int i = 0; i< titleLabel.length; i++){
            titleLabel[i] = new JLabel();
            titleLabel[i].setText(titleStr[i]);
        }

        int size = 50;
        int y = 2;
        titleLabel[0].setBounds(30, y, size, size);
        titleLabel[1].setBounds(330, y, size, size);
        titleLabel[2].setBounds(630, y, size, size);

        for (JLabel jLabel: titleLabel){
            this.add(jLabel);
        }
    }

    private void configKeyLabel(){
        for(int i = 0; i< keyNameLabel.length; i++){
            keyNameLabel[i] = new JLabel();
            keyNameLabel[i].setText(keyName[i]);

            keyValueLabel[i] = new JLabel();
            keyValueLabel[i].setText(String.valueOf(keyValue[i]));

            int keyX = 630;
            int valueX = 730;
            int y = 50 + 40 * i;
            int width = 50;
            int height = 30;

            keyNameLabel[i].setBounds(keyX, y, width, height);
            keyValueLabel[i].setBounds(valueX, y, width, height);
            this.add(keyNameLabel[i]);
            this.add(keyValueLabel[i]);
        }
    }

}
