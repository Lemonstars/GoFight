package model.thing;

import model.floor.FloorFactory;
import model.thing.basic.TileThing;
import model.thing.basic.WallThing;
import model.thing.monster.*;
import model.thing.door.BlueDoorThing;
import model.thing.door.RedDoorThing;
import model.thing.door.YellowDoorThing;
import model.thing.hero.AbstractHero;
import model.thing.hero.AttackerHero;
import model.thing.hero.DefencerHero;
import model.thing.key.BlueKeyThing;
import model.thing.key.RedKeyThing;
import model.thing.key.YellowKeyThing;
import model.thing.self.BloodBottleThing;
import model.thing.self.BlueGemstoneThing;
import model.thing.self.RedGemstoneThing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class ThingFactory {

    private static final Map<Integer, IThing> THING_MAP = new HashMap<>(32);

    public static AbstractHero createAttacker(FloorFactory floorFactory){
        AbstractHero hero = new AttackerHero(floorFactory);
        THING_MAP.put(ThingType.HERO.ordinal(), hero);
        return hero;
    }

    public static AbstractHero createDefencer(FloorFactory floorFactory){
        AbstractHero hero = new DefencerHero(floorFactory);
        THING_MAP.put(ThingType.HERO.ordinal(), hero);
        return hero;
    }

    public static IThing create(ThingType thingType){
        return create(thingType.ordinal());
    }

    public static IThing create(int type){
        // todo 享元工厂
        IThing thing = THING_MAP.get(type);

        if(null == thing){
            switch (type){
                case 0:
                    thing = new TileThing();
                    break;
                case 1:
                    thing = new WallThing();
                    break;
                case 2:
                    thing = new YellowDoorThing();
                    break;
                case 3:
                    thing = new BlueDoorThing();
                    break;
                case 4:
                    thing = new RedDoorThing();
                    break;
                case 5:
                    thing = new StepUpThing();
                    break;
                case 6:
                    thing = new StepDownThing();
                    break;
                case 7:
                    thing = new YellowKeyThing();
                    break;
                case 8:
                    thing = new BlueKeyThing();
                    break;
                case 9:
                    thing = new RedKeyThing();
                    break;
                case 10:
                    thing = new Bat();
                    break;
                case 11:
                    thing = new Skeleton();
                    break;
                case 12:
                    thing = new ShrekRed();
                    break;
                case 13:
                    thing = new ShrekBlue();
                    break;
                case 14:
                    thing = new ShrekBlack();
                    break;
                case 15:
                    thing = new Corpse();
                    break;
                case 16:
                    thing = new BlueGemstoneThing();
                    break;
                case 17:
                    thing = new RedGemstoneThing();
                    break;
                case 18:
                    thing = new BloodBottleThing();
                    break;
                    default:
                        throw new IllegalArgumentException("未识别地图物件类型:" + type);
            }
            THING_MAP.put(type, thing);
        }

        return thing;
    }

}