package model.thing.hero;

import data.NotificationContent;
import model.floor.Floor;
import model.floor.FloorFactory;
import model.thing.IThing;
import model.thing.ThingType;
import model.thing.equipment.IEquipment;
import model.thing.hero.mediator.ConcreteMeetMediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public abstract class AbstractHero extends Observable implements IThing {

    protected int money;
    protected int experience;
    protected int keyYellow;
    protected int keyBlue;
    protected int keyRed;

    protected int attack;
    protected int defence;
    protected int blood;
    protected String description;

    protected Floor floor;
    protected int currentX;
    protected int currentY;

    protected ConcreteMeetMediator meetMediator = new ConcreteMeetMediator();

    protected List<IEquipment> equipmentList = new ArrayList<>();

    /**
     * delay to initialize according to different roles
     */
    public abstract void initRole();

    public void initUpFloor(Floor floor){
        this.floor = floor;
        currentX = floor.getUpX();
        currentY = floor.getUpY();
    }

    private void initDownFloor(Floor floor){
        this.floor = floor;
        currentX = floor.getDownX();
        currentY = floor.getDownY();
    }

    public void initBasicInfo(){
        this.money = 0;
        this.experience = 0;

        this.keyYellow = 3;
        this.keyBlue = 2;
        this.keyRed = 1;
    }

    public void equip(IEquipment equipment){
        equipmentList.add(equipment);
    }

    public void upstairs(){
        int level = floor.getLevel() + 1;
        Floor upFloor = FloorFactory.createFloor(level);
        initUpFloor(upFloor);
        locate();
    }

    public void downstairs(){
        int level = floor.getLevel() - 1;
        Floor upFloor = FloorFactory.createFloor(level);
        initDownFloor(upFloor);
        locate();
    }

    public void locate(){
        floor.locateThing(currentX, currentY, ThingType.HERO);
    }

    public void goUp(){
        goLocation(true, false);
    }

    public void goDown(){
        goLocation(true, true);
    }

    public void goLeft(){
        goLocation(false, false);
    }

    public void goRight(){
        goLocation(false, true);
    }

    private void goLocation(boolean isX, boolean isAdd){
        int newX = isX ? currentX + (isAdd ? 1 : -1): currentX;
        int newY = isX ? currentY: currentY + (isAdd ? 1 : -1);

        meetMediator.meet(this, newX, newY);
    }

    public void notifyObserverChanged(NotificationContent content){
        // todo 观察者模式
        setChanged();
        notifyObservers(content);
    }

    public void moveTo(int newX, int newY){
        floor.locateThing(currentX, currentY, ThingType.TILE);
        currentX = newX;
        currentY = newY;
        floor.locateThing(currentX, currentY, ThingType.HERO);
    }

    @Override
    public String getPicName() {
        return "hero.png";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.HERO;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public List<IEquipment> getEquipmentList() {
        return equipmentList;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void increaseMoney(int num) {
        this.money += num;
    }

    public void increaseExperience(int num) {
        this.experience += num;
    }

    public void increaseAttack(int num){
        this.attack += num;
    }

    public void increaseDefence(int num){
        this.defence += num;
    }

    public void increaseBlood(int num){
        this.blood += num;
    }

    public void increaseYellowKey(){
        this.keyYellow++;
    }

    public void increaseBlueKey(){
        this.keyBlue++;
    }

    public void increaseRedKey(){
        this.keyRed++;
    }

    public void decreaseYellowKey(){
        this.keyYellow--;
    }

    public void decreaseBlueKey(){
        this.keyBlue--;
    }

    public void decreaseRedKey(){
        this.keyRed--;
    }

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public int getMoney() {
        return money;
    }

    public int getExperience() {
        return experience;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getBlood() {
        return blood;
    }

    public int getKeyYellow() {
        return keyYellow;
    }

    public int getKeyBlue() {
        return keyBlue;
    }

    public int getKeyRed() {
        return keyRed;
    }

    public Floor getFloor() {
        return floor;
    }

    public ConcreteMeetMediator getMeetMediator() {
        return meetMediator;
    }
}
