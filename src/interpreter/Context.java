package interpreter;

import java.util.StringTokenizer;

/**
 * @author liangxiong
 * @date 2019-11-17 15:35
 * @description 语法解析上下文
 **/
public class Context {

    /**
     * 分词器
     */
    private StringTokenizer tokenizer;

    /**
     * 当前标记
     */
    private String currentToken;

    public Context(String text) {
        this.tokenizer = new StringTokenizer(text);
        nextToken();
    }

    /**
     * 获取下一个标记(指针指向下一个标记)
     *
     * @return
     */
    public String nextToken() {
        // 是否有下一个标记
        if (tokenizer.hasMoreTokens()) {
            // 获取下一个标记
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    /**
     * 获取当前标记(指针不变)
     *
     * @return
     */
    public String getCurrentToken() {
        return currentToken;
    }

    /**
     * 先检查当前标记,然后获取下一个标记
     *
     * @param token
     * @throws ParseException
     */
    public void skipToken(String token) throws ParseException {
        if (!token.equals(currentToken)) {
            throw new ParseException("Warning: " + token + " is expected, but " + currentToken + "is found.");
        }
        nextToken();
    }

    /**
     * 获取当前标记对应的数值(也就是循环体次数)
     *
     * @return
     * @throws ParseException
     */
    public int currentNumber() throws ParseException {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning: " + e);
        }
        return number;
    }
}
