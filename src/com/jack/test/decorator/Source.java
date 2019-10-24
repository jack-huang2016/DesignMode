/**
 * FileName: Source
 * Author:   huang.yj
 * Date:     2019/10/24 17:02
 * Description: 被装饰类
 */
package com.jack.test.decorator;

/**
 * 〈被装饰类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}