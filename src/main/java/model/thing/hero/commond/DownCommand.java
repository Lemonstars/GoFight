package model.thing.hero.commond;

import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/24
 */
public class DownCommand extends AbstractCommand{

    public DownCommand(AbstractHero hero) {
        super(hero);
    }

    @Override
    public void execute() {
        hero.goDown();
    }
}
