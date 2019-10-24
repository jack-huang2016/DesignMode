/**
 * FileName: AdapterTest
 * Author:   huang.yj
 * Date:     2019/10/24 15:38
 * Description: 测试类
 */
package com.jack.test.adapter;

/**
 * 〈测试类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}