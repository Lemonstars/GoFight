package model.thing.hero.decorator;

import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/25
 */
public class ShieldDecorator extends AbstractWeaponDecorator {

    private AbstractHero basicHero;

    public ShieldDecorator(AbstractHero basicHero) {
        this.basicHero = basicHero;
    }

    @Override
    public void initRole() {
        basicHero.initRole();
    }

    @Override
    public int getDefence() {
        int newDefence = (int)(basicHero.getDefence() * 1.1);
        return newDefence;
    }
}
