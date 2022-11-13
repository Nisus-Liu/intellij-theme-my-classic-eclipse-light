
/**
 * Test It
 * 测试类
 * <p>
 * Chinese char view, hello China!
 * 中文测试, 你好, 中国!
 *
 * @author L_J
 * @since 2022/10/7 21:19
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(MainExample.sfs);

        System.out.println(MainExample.deprecatedProp);
        MainExample.deprecateMethod();
        MainExample.deprecatedForRemoval();

        // ligatures 效果
        System.out.println("a == b ? c >= d ? === => ==> ===> --------------> O(∩_∩)O~");
    }
}
