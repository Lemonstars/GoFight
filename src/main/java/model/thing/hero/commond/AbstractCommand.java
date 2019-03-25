package model.thing.hero.commond;

import model.floor.Floor;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/24
 */
public abstract class AbstractCommand {

    protected AbstractHero hero;

    public AbstractCommand(AbstractHero hero) {
        this.hero = hero;
    }

    /**
     * 执行命令
     */
    abstract public void execute();

    @Override
    public String toString() {
        Floor floor = hero.getFloor();
        int level = floor.getLevel();
        int x = hero.getCurrentX();
        int y = hero.getCurrentY();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(level);
        stringBuilder.append(' ');
        stringBuilder.append(x);
        stringBuilder.append(' ');
        stringBuilder.append(y);

        return stringBuilder.toString();
    }
}
