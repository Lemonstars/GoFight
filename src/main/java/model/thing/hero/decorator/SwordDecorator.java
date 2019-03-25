package model.thing.hero.decorator;

import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/25
 */
public class SwordDecorator extends AbstractWeaponDecorator {

    private AbstractHero basicHero;

    public SwordDecorator(AbstractHero basicHero) {
        this.basicHero = basicHero;
        restore();
    }

    private void restore(){
        this.floor = basicHero.getFloor();
        this.currentX = basicHero.getCurrentX();
        this.currentY = basicHero.getCurrentY();

        this.money = basicHero.getMoney();
        this.experience = basicHero.getExperience();
        this.keyYellow = basicHero.getKeyYellow();
        this.keyBlue = basicHero.getKeyBlue();
        this.keyRed = basicHero.getKeyRed();

        this.meetMediator = basicHero.getMeetMediator();
        this.equipmentList = basicHero.getEquipmentList();
    }

    @Override
    public void initRole() {
        this.attack = (int)(basicHero.getAttack() * 1.1);
        this.defence = basicHero.getDefence();
        this.blood = basicHero.getBlood();
        this.description = basicHero.getDescription() + "佩剑";
    }

}
