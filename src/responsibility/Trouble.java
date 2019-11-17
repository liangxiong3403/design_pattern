package responsibility;

/**
 * @author liangxiong
 * @date 2019-11-10 19:27
 * @description 表示问题
 **/
public class Trouble {

    /**
     * 问题编号
     */
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "number=" + number +
                '}';
    }
}
