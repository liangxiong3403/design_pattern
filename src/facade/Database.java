package facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author liangxiong
 * @date 2019-11-10 20:36
 * @description 数据库类
 **/
public class Database {

    /**
     * 后缀
     */
    private static final String TEXT_POSTFIX = ".txt";

    private Database() {
    }

    public static Properties getProperties(String database) {
        String filename = database + TEXT_POSTFIX;
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
