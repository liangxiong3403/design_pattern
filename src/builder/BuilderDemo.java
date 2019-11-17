package builder;

/**
 * @author liangxiong
 * @Date:2019/9/8
 * @Time:15:38
 * @Description
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Builder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.build();
        String textBuilderResult = textBuilder.getResult();
        System.out.println(textBuilderResult);
        Builder htmlBuilder = new HTMLBuilder();
        Director director2 = new Director(htmlBuilder);
        director2.build();
        String htmlBuilderResult = htmlBuilder.getResult();
        System.out.println(htmlBuilderResult);
    }
}
