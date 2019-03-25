package model.thing.hero.decorator;

import data.NotificationContent;
import model.floor.Floor;
import model.thing.ThingType;
import model.thing.equipment.IEquipment;
import model.thing.hero.AbstractHero;
import model.thing.hero.mediator.ConcreteMeetMediator;
import model.thing.weapon.IWeapon;

import java.util.List;

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
        this.level = basicHero.getLevel();
        this.attack = (int)(basicHero.getAttack() * 1.1);
        this.defence = basicHero.getDefence();
        this.blood = basicHero.getBlood();
        this.description = basicHero.getDescription() + "佩剑";
    }

    @Override
    public void notifyObserverChanged(NotificationContent content) {
        basicHero.notifyObserverChanged(content);
    }

    @Override
    public void initUpFloor(Floor floor) {
        basicHero.initUpFloor(floor);
    }

    @Override
    public void initBasicInfo() {
        basicHero.initBasicInfo();
    }

    @Override
    public void equip(IEquipment equipment) {
        basicHero.equip(equipment);
    }

    @Override
    public void upstairs() {
        basicHero.upstairs();
    }

    @Override
    public void downstairs() {
        basicHero.downstairs();
    }

    @Override
    public void locate() {
        basicHero.locate();
    }

    @Override
    public void goUp() {
        basicHero.goUp();
    }

    @Override
    public void goDown() {
        basicHero.goDown();
    }

    @Override
    public void goLeft() {
        basicHero.goLeft();
    }

    @Override
    public void goRight() {
        basicHero.goRight();
    }

    @Override
    public void moveTo(int newX, int newY) {
        basicHero.moveTo(newX, newY);
    }

    @Override
    public void increaseMoney(int num) {
        basicHero.increaseMoney(num);
    }

    @Override
    public void increaseExperience(int num) {
        basicHero.increaseExperience(num);
    }

    @Override
    public void increaseAttack(int num) {
        basicHero.increaseAttack(num);
    }

    @Override
    public void increaseDefence(int num) {
        basicHero.increaseDefence(num);
    }

    @Override
    public void increaseBlood(int num) {
        basicHero.increaseBlood(num);
    }

    @Override
    public void increaseYellowKey() {
        basicHero.increaseYellowKey();
    }

    @Override
    public void increaseBlueKey() {
        basicHero.increaseBlueKey();
    }

    @Override
    public void increaseRedKey() {
        basicHero.increaseRedKey();
    }

    @Override
    public void decreaseYellowKey() {
        basicHero.decreaseYellowKey();
    }

    @Override
    public void decreaseBlueKey() {
        basicHero.decreaseBlueKey();
    }

    @Override
    public void decreaseRedKey() {
        basicHero.decreaseRedKey();
    }

    @Override
    public void decreaseExperience(int num) {
        basicHero.decreaseExperience(num);
    }

    @Override
    public void acquireWeapon(IWeapon weapon) {
        basicHero.acquireWeapon(weapon);
    }

    @Override
    public List<IEquipment> getEquipmentList() {
        return basicHero.getEquipmentList();
    }

    @Override
    public List<IWeapon> getWeaponList() {
        return basicHero.getWeaponList();
    }

    @Override
    public void setBlood(int blood) {
        basicHero.setBlood(blood);
    }

    @Override
    public int getCurrentX() {
        return basicHero.getCurrentX();
    }

    @Override
    public int getCurrentY() {
        return basicHero.getCurrentY();
    }

    @Override
    public Floor getFloor() {
        return basicHero.getFloor();
    }

    @Override
    public ConcreteMeetMediator getMeetMediator() {
        return basicHero.getMeetMediator();
    }


}
