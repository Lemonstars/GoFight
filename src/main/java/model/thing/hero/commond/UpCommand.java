package model.thing.hero.commond;

import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/24
 */
public class UpCommand extends AbstractCommand {

    public UpCommand(AbstractHero hero) {
        super(hero);
    }

    @Override
    public void execute() {
        hero.goUp();
    }
}
