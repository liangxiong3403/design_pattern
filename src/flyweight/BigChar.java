package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author liangxiong
 * @date 2019-11-16 21:39
 * @description 大型字符
 **/
public class BigChar {

    /**
     * 大型字符对应的字符串
     */
    private String fontData;

    public BigChar(char charName) {
        /**
         * 字符名称
         */
        try {
            BufferedReader reader = new BufferedReader(new FileReader("out/production/design_pattern/flyweight/big" + charName + ".txt"));
            String line;
            StringBuffer sb = new StringBuffer(16);
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            reader.close();
            this.fontData = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            this.fontData = charName + "?";
        }
    }

    /**
     * 显示大型字符
     */
    public void print() {
        System.out.println(fontData);
    }
}
