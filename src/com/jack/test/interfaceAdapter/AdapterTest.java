/**
 * FileName: AdapterTest
 * Author:   huang.yj
 * Date:     2019/10/24 16:07
 * Description: 测试类
 */
package com.jack.test.interfaceAdapter;

/**
 * 〈测试类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class AdapterTest {
    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}