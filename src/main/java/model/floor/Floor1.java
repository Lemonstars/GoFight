package model.floor;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/19
 */
public class Floor1 extends Floor{

    public Floor1(String floorFile, int level) {
        super(floorFile, level);
    }

    @Override
    public int getUpX() {
        return 9;
    }

    @Override
    public int getUpY() {
        return 19;
    }

    @Override
    public int getDownX() {
        return 0;
    }

    @Override
    public int getDownY() {
        return 1;
    }
}
