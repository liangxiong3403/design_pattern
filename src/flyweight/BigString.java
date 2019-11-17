package flyweight;

import java.util.Arrays;

/**
 * @author liangxiong
 * @date 2019-11-16 21:58
 * @description 大型字符串
 **/
public class BigString {

    /**
     * 大型字符对象组成地数组
     */
    private BigChar[] bigChars;

    public BigString(String name) {
        this.bigChars = new BigChar[name.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(name.charAt(i));
        }
    }

    /**
     * 显示
     */
    public void print() {
        Arrays.stream(bigChars).forEach(e -> e.print());
    }
}
