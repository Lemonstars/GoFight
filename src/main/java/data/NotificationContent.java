package data;

import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/22
 */
public class NotificationContent {

    private boolean floorChanged;
    private boolean roleChanged;
    private boolean keyChanged;
    private boolean equipmentChanged;

    private int oldX;
    private int oldY;
    private int newX;
    private int newY;

    private AbstractHero hero;

    public NotificationContent(int oldX, int oldY, int newX, int newY) {
        this.oldX = oldX;
        this.oldY = oldY;
        this.newX = newX;
        this.newY = newY;
    }

    public AbstractHero getHero() {
        return hero;
    }

    public void setHero(AbstractHero hero) {
        this.hero = hero;
    }

    public int getOldX() {
        return oldX;
    }

    public int getOldY() {
        return oldY;
    }

    public int getNewX() {
        return newX;
    }

    public int getNewY() {
        return newY;
    }

    public boolean isEquipmentChanged() {
        return equipmentChanged;
    }

    public void setEquipmentChanged(boolean equipmentChanged) {
        this.equipmentChanged = equipmentChanged;
    }

    public boolean isFloorChanged() {
        return floorChanged;
    }

    public void setFloorChanged(boolean floorChanged) {
        this.floorChanged = floorChanged;
    }

    public boolean isRoleChanged() {
        return roleChanged;
    }

    public void setRoleChanged(boolean roleChanged) {
        this.roleChanged = roleChanged;
    }

    public boolean isKeyChanged() {
        return keyChanged;
    }

    public void setKeyChanged(boolean keyChanged) {
        this.keyChanged = keyChanged;
    }
}
