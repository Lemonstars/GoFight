package model.hero;

import constant.MapConstant;
import model.floor.Floor;
import model.floor.FloorFactory;
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

    protected int attack;
    protected int defence;
    protected int blood;

    private Floor floor;

    public AbstractHero() {
        initFloor();
        initRole();
    }

    abstract void initRole();

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
        if(newX < 0 || newX >= MapConstant.ROW || newY < 0 || newY >= MapConstant.COL){
            return;
        }

        // todo 判断是否可走:墙、怪物


        floor.locateThing(currentX, currentY, ThingType.TILE);
        currentX = newX;
        currentY = newY;
        floor.locateThing(currentX, currentY, ThingType.HERO);

        setChanged();
        notifyObservers();
    }

    public int getAttackNum(){
        return attack;
    }

    public int getDefenceNum(){
        return defence;
    }


    public int getBloodNum(){
        return blood;
    }

    public Floor getFloor() {
        return floor;
    }


}
