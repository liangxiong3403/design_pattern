package interpreter;

/**
 * @author liangxiong
 * @date 2019-11-17 15:36
 * @description 语法解析出现异常
 **/
public class ParseException extends Exception {

    public ParseException(String message) {
        super(message);
    }
}
