package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liangxiong
 * @date 2019-11-16 21:51
 * @description 工厂类
 **/
public class BigCharFactory {

    private Map<Character, BigChar> pool = new HashMap<>(16);

    private static final BigCharFactory FACTORY = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return FACTORY;
    }

    /**
     * 生成共享BigChar实例
     *
     * @param charName 字符名称
     * @return
     */
    public synchronized BigChar getBigChar(char charName) {
        BigChar bigChar = pool.get(charName);
        if (bigChar == null) {
            bigChar = new BigChar(charName);
            pool.put(charName, bigChar);
        }
        return bigChar;
    }
}
