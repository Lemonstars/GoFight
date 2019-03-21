package model.floor;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class Floor4 extends Floor{

    public Floor4(String floorFile) {
        super(floorFile);
    }

    @Override
    public int getStartX() {
        return 9;
    }

    @Override
    public int getStartY() {
        return 18;
    }
}
