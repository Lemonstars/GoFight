package model.thing.hero;

import data.NotificationContent;
import model.floor.Floor;
import model.floor.FloorFactory;
import model.thing.IThing;
import model.thing.ThingType;

import java.util.Observable;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public abstract class AbstractHero extends Observable implements IThing {

    private Floor floor;
    private int currentX;
    private int currentY;

    private ConcreteMeetMediator meetMediator;

    private int money;
    private int experience;
    private int keyYellow;
    private int keyBlue;
    private int keyRed;

    protected int attack;
    protected int defence;
    protected int blood;
    protected String description;

    public AbstractHero(FloorFactory floorFactory) {
        // todo 模版方法
        initFloor(floorFactory);
        initBasicInfo();
        initRole();
        initMediator();
    }

    /**
     * delay to initialize according to different roles
     */
    abstract void initRole();

    private void initMediator(){
        meetMediator = new ConcreteMeetMediator();
    }

    private void initFloor(FloorFactory floorFactory){
        floor = floorFactory.createFloor(1);
        currentX = floor.getStartX();
        currentY = floor.getStartY();
    }

    private void initBasicInfo(){
        this.money = 0;
        this.experience = 0;

        this.keyYellow = 3;
        this.keyBlue = 2;
        this.keyRed = 1;
    }

    public void initLocation(){
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

        // if the new location is the wall, the hero does not move
        IThing thing = floor.getThingType(newX, newY);
        meetMediator.meet(this, thing, newX, newY);
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
        this.defence -= num;
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


}
