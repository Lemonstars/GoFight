package ui.dialog;

import constant.ShopConstant;
import model.thing.hero.AbstractHero;
import util.LocationUtil;

import javax.swing.*;
import java.awt.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/25
 */
public class ExperienceShopDialog extends JDialog {

    public ExperienceShopDialog(String title, AbstractHero hero) {
        init(title, hero);
    }

    private void init(String title, AbstractHero hero){
        int width = 300;
        int height = 180;
        int x = LocationUtil.computeLocationX(width);
        int y = LocationUtil.computeLocationY(height);
        getContentPane().setBackground(new Color(230, 247, 255));
        setLayout(null);
        setTitle(title);
        setBounds(x, y, width, height);
        setModal(true);

        JLabel hint = new JLabel(ShopConstant.EXPERIENCE_HINT);
        hint.setBounds(50, 40, 200, 30);
        add(hint);

        JButton agreeButton = new JButton(ShopConstant.AGREE);
        JButton cancelButton = new JButton(ShopConstant.CANCEL);
        agreeButton.setBounds( 150, 100, 50, 30);
        cancelButton.setBounds( 200, 100, 50, 30);

        agreeButton.addActionListener(e -> {
            if(hero.getExperience() >= ShopConstant.EXPERIENCE_PAY){
                hero.decreaseExperience(ShopConstant.EXPERIENCE_PAY);
                int currentLevel = hero.getLevel() + 1;
                hero.setLevel(currentLevel);

            }

            dispose();
        });
        cancelButton.addActionListener(e -> dispose());

        add(agreeButton);
        add(cancelButton);

        setVisible(true);
    }



}


