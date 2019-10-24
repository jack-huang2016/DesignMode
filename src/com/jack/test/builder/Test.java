/**
 * FileName: Test
 * Author:   huang.yj
 * Date:     2019/10/24 14:49
 * Description: 测试类
 */
package com.jack.test.builder;

/**
 * 〈测试类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}