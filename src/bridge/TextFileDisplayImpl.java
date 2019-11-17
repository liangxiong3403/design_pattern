package bridge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author liangxiong
 * @date 2019-11-06 21:14
 * @description 显示文本文件
 **/
public class TextFileDisplayImpl extends DisplayImpl {

    private String filePath;

    private FileReader fr;

    private BufferedReader br;

    public TextFileDisplayImpl(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void rawOpen() {
        File file = new File(filePath);
        if (file.exists() && file.canRead()) {
            try {
                fr = new FileReader(file);
                br = new BufferedReader(fr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void rawPrint() {
        String content;
        try {
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        if (fr != null) {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
