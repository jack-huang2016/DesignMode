/**
 * FileName: DecoratorTest
 * Author:   huang.yj
 * Date:     2019/10/24 17:05
 * Description: 测试类
 */
package com.jack.test.decorator;

/**
 * 〈测试类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}