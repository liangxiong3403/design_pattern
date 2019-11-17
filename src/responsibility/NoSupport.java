package responsibility;

/**
 * @author liangxiong
 * @date 2019-11-10 19:40
 * @description 不支持解决问题
 **/
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    /**
     * 一直返回false,表示不解决问题
     *
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
