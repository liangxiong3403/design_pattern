package visitor;

/**
 * @author liangxiong
 * @date 2019-11-09 21:34
 * @description 测试
 **/
public class VisitorDemo {

    public static void main(String[] args) throws FileTreatmentException {
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");
        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vi", 1000));
        bin.add(new File("latex", 2000));
        System.out.println(" ");
        Directory google = new Directory("google");
        Directory apple = new Directory("apple");
        Directory amazon = new Directory("amazon");
        usr.add(google);
        usr.add(apple);
        usr.add(amazon);

        google.add(new File("chrome", 100));
        google.add(new File("youtube", 200));
        apple.add(new File("mac book", 300));
        apple.add(new File("iphone", 400));
        amazon.add(new File("shop", 500));
        root.accept(new ListVisitor());
    }
}
