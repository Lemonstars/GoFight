package model.monster;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class Bat implements IMonster {

    @Override
    public int getAttackNum() {
        return 10;
    }

    @Override
    public int getDefenceNum() {
        return 10;
    }

    @Override
    public int getBlood() {
        return 100;
    }

    @Override
    public int getExperience() {
        return 2;
    }

    @Override
    public int getMoney() {
        return 3;
    }
}
