package interpreter;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author liangxiong
 * @date 2019-11-17 16:14
 * @description
 **/
public class InterpreterTest {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("out/production/design_pattern/interpreter/program.txt"));
        String text;
        while ((text = reader.readLine()) != null) {
            System.out.println("text = \"" + text + "\"");
            Node node = new ProgramNode();
            node.parse(new Context(text));
            System.out.println("node= " + node);
        }
        reader.close();
    }
}
