/**
 * FileName: AdapterTest
 * Author:   huang.yj
 * Date:     2019/10/24 15:54
 * Description: 测试类
 */
package com.jack.test.objectAdapter;

/**
 * 〈测试类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class AdapterTest {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Adapter(source);
        target.method1();
        target.method2();
    }
}