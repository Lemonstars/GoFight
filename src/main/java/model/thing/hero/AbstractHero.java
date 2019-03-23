package model.thing.hero;

import data.NotificationContent;
import model.floor.Floor;
import model.floor.FloorFactory;
import model.thing.IThing;
import model.thing.ThingFactory;
import model.thing.ThingType;

import java.util.Observable;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public abstract class AbstractHero extends Observable {

    private FloorFactory floorFactory;
    private int currentX;
    private int currentY;

    private int money;
    private int experience;
    private int keyYellow;
    private int keyBlue;
    private int keyRed;

    protected int attack;
    protected int defence;
    protected int blood;
    protected String description;

    private Floor floor;

    public AbstractHero() {
        // todo 模版方法
        initCommon();
        initFloor();
        initRole();
    }

    /**
     * delay to initialize according to different roles
     */
    abstract void initRole();

    private void initCommon(){
        this.money = 0;
        this.experience = 0;

        this.keyYellow = 3;
        this.keyBlue = 2;
        this.keyRed = 1;
    }

    private void initFloor(){
        floorFactory = new FloorFactory();
        floor = floorFactory.createFloor(1);

        currentX = floor.getStartX();
        currentY = floor.getStartY();
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
        int newX = currentX;
        int newY = currentY;
        if(isX){
            newX = currentX + (isAdd ? 1 : -1);
        }else {
            newY = currentY + (isAdd ? 1 : -1);
        }

        // go beyond the range of the map
        boolean isValid = floor.isValidLocation(newX, newY);
        if(!isValid){
            return;
        }

        // if the new location is the wall, the hero does not move
        IThing thing = floor.getThingType(newX, newY);
        ThingType thingType = thing.getThingType();
        if(thingType == ThingType.WALL){
            return;
        }

        NotificationContent content = new NotificationContent(currentX, currentY, newX, newY);


        // if the new location is a key
        if(thingType == ThingType.KEY_YELLOW){
            this.keyYellow += 1;
            content.setKeyChanged(true);
        }
        if(thingType == ThingType.KEY_BLUE){
            this.keyBlue += 1;
            content.setKeyChanged(true);
        }
        if(thingType == ThingType.KEY_RED){
            this.keyRed += 1;
            content.setKeyChanged(true);
        }

        // todo 判断是否为怪物

        floor.locateThing(currentX, currentY, ThingType.TILE);
        currentX = newX;
        currentY = newY;
        floor.locateThing(currentX, currentY, ThingType.HERO);

        // todo 观察者模式
        setChanged();
        notifyObservers(content);
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

    public String getDescription() {
        return description;
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
