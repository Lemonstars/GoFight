package model.floor;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class Floor4 extends Floor{

    public Floor4(String floorFile, int level) {
        super(floorFile, level);
    }

    @Override
    public int getUpX() {
        return 9;
    }

    @Override
    public int getUpY() {
        return 18;
    }

    @Override
    public int getDownX() {
        return 0;
    }

    @Override
    public int getDownY() {
        return 0;
    }
}
