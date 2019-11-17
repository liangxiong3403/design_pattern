package responsibility;

/**
 * @author liangxiong
 * @date 2019-11-10 19:44
 * @description 解决编号为奇数的问题
 **/
public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    /**
     * 解决编号为奇数的问题
     *
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        int flag = 2;
        if (trouble.getNumber() % flag != 0) {
            return true;
        }
        return false;
    }
}
