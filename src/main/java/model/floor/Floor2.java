package model.floor;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/20
 */
public class Floor2 extends Floor {

    public Floor2(String floorFile, int level) {
        super(floorFile, level);
    }

    @Override
    public int getUpX() {
        return 0;
    }

    @Override
    public int getUpY() {
        return 1;
    }

    @Override
    public int getDownX() {
        return 0;
    }

    @Override
    public int getDownY() {
        return 18;
    }
}
