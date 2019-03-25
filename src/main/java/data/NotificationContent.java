package data;

import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/22
 */
public class NotificationContent {

    private boolean isShop;
    private boolean equipmentChanged;
    private boolean weaponChanged;
    private boolean floorChanged;
    private boolean roleChanged;
    private boolean keyChanged;
    private boolean decorated;

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

    public boolean isShop() {
        return isShop;
    }

    public void setShop(boolean shop) {
        isShop = shop;
    }

    public void setHero(AbstractHero hero) {
        this.hero = hero;
    }

    public boolean isDecorated() {
        return decorated;
    }

    public void setDecorated(boolean decorated) {
        this.decorated = decorated;
    }

    public boolean isWeaponChanged() {
        return weaponChanged;
    }

    public void setWeaponChanged(boolean weaponChanged) {
        this.weaponChanged = weaponChanged;
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
