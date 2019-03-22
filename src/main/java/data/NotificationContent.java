package data;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/22
 */
public class NotificationContent {

    private boolean roleChanged;
    private boolean keyChanged;

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
