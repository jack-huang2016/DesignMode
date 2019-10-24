/**
 * FileName: Decorator
 * Author:   huang.yj
 * Date:     2019/10/24 17:04
 * Description: 装饰类
 */
package com.jack.test.decorator;

/**
 * 〈装饰类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class Decorator implements Sourceable{
    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }
    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}