package ui.panel;

import data.NotificationContent;
import model.thing.hero.AbstractHero;

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

    private JLabel[] keyHintLabel = new JLabel[3];
    private String[] keyHintStr = {"黄钥匙", "蓝钥匙", "红钥匙"};

    private JLabel[] keyContentLabel = new JLabel[3];
    private int[] keyContentStr = new int[3];

    public InfoPanel(AbstractHero hero) {
        this.hero = hero;
        this.hero.addObserver(this);

        this.setBounds(0, 400, 800, 200);
        this.setLayout(null);
        this.setBackground(new Color(230, 247, 255));

        configTitleLabel();
        configKeyHintLabel();
        configKeyContent();

        this.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        NotificationContent content = (NotificationContent)arg;
        if(content.isKeyChanged()){
            configKeyContent();
        }
    }

    private void configTitleLabel(){
        int size = 50;
        int y = 2;
        for(int i = 0; i < titleLabel.length; i++){
            titleLabel[i] = new JLabel();
            titleLabel[i].setText(titleStr[i]);
            titleLabel[i].setBounds(30 + 300 * i, y, size, size);
            this.add(titleLabel[i]);
        }
    }


    private void configKeyHintLabel(){
        for(int i = 0; i < keyHintLabel.length; i++){
            keyHintLabel[i] = new JLabel();
            keyHintLabel[i].setText(keyHintStr[i]);
            keyContentLabel[i] = new JLabel();

            int keyX = 630;
            int valueX = 730;
            int y = 50 + 40 * i;
            int width = 50;
            int height = 30;

            keyHintLabel[i].setBounds(keyX, y, width, height);
            keyContentLabel[i].setBounds(valueX, y, width, height);
            this.add(keyHintLabel[i]);
            this.add(keyContentLabel[i]);
        }
    }

    private void configKeyContent(){
        keyContentStr[0] = hero.getKeyYellow();
        keyContentStr[1] = hero.getKeyBlue();
        keyContentStr[2] = hero.getKeyRed();

        for(int i = 0; i < keyContentLabel.length; i++){
            keyContentLabel[i].setText(String.valueOf(keyContentStr[i]));
            keyContentLabel[i].updateUI();
        }
    }




}
