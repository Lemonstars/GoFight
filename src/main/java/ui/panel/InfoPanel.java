package ui.panel;

import data.NotificationContent;
import model.thing.equipment.BookThing;
import model.thing.equipment.IEquipment;
import model.thing.hero.AbstractHero;
import model.thing.weapon.IWeapon;
import ui.dialog.MonsterDialog;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/18
 */
public class InfoPanel extends JPanel implements Observer{

    private String[] titleStr = { "武器", "技能", "装备", "钥匙"};
    private JLabel[] titleLabel = new JLabel[titleStr.length];

    private JLabel[] keyHintLabel = new JLabel[3];
    private String[] keyHintStr = {"黄钥匙", "蓝钥匙", "红钥匙"};

    private JLabel[] keyContentLabel = new JLabel[3];
    private int[] keyContentStr = new int[3];

    private JButton[] equipmentButton = new JButton[2];

    private JLabel[] weaponLabel;

    public InfoPanel(AbstractHero hero) {
        hero.addObserver(this);

        this.setBounds(0, 400, 800, 200);
        this.setLayout(null);
        this.setBackground(new Color(230, 247, 255));

        configTitleLabel();
        configKeyHintLabel();
        configKeyContent(hero);
        configEquipmentButton();

        this.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        NotificationContent content = (NotificationContent)arg;
        AbstractHero hero = content.getHero();
        if(content.isKeyChanged()){
            configKeyContent(hero);
        }

        if(content.isEquipmentChanged()){
            showEquipment(hero);
        }

        if(content.isWeaponChanged()){
            showWeapon(hero);
        }

    }

    private void configTitleLabel(){
        int size = 50;
        int y = 2;
        for(int i = 0; i < titleLabel.length; i++){
            titleLabel[i] = new JLabel();
            titleLabel[i].setText(titleStr[i]);
            titleLabel[i].setBounds(30 + 200 * i, y, size, size);
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

    private void configKeyContent(AbstractHero hero){
        keyContentStr[0] = hero.getKeyYellow();
        keyContentStr[1] = hero.getKeyBlue();
        keyContentStr[2] = hero.getKeyRed();

        for(int i = 0; i < keyContentLabel.length; i++){
            keyContentLabel[i].setText(String.valueOf(keyContentStr[i]));
            keyContentLabel[i].updateUI();
        }
    }

    private void configEquipmentButton(){
        for(int i = 0; i< equipmentButton.length; i++){
            equipmentButton[i] = new JButton();
            equipmentButton[i].setBounds(430, 50 + 60 * i, 80, 50);
            add(equipmentButton[i]);
            equipmentButton[i].setVisible(false);
        }
    }

    private void showEquipment(AbstractHero hero){
        List<IEquipment> equipmentList = hero.getEquipmentList();
        for(int i=0; i<equipmentList.size(); i++){
            IEquipment equipment = equipmentList.get(i);
            String description = equipment.getDescription();
            equipmentButton[i].setText(description);
            equipmentButton[i].setVisible(true);
            if(equipment instanceof BookThing){
                equipmentButton[i].addActionListener(e -> new MonsterDialog(description));
            }
        }
    }

    private void showWeapon(AbstractHero hero){
        List<IWeapon> weaponList = hero.getWeaponList();
        weaponLabel = new JLabel[weaponList.size()];
        for(int i=0; i < weaponList.size(); i++){
            IWeapon weapon = weaponList.get(i);
            String name = weapon.getDescription();
            weaponLabel[i] = new JLabel(name);
            add(weaponLabel[i]);
            weaponLabel[i].setBounds(30, 50 + 40 * i, 50, 30);
            weaponLabel[i].setVisible(true);
        }
    }


}
