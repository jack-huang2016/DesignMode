/**
 * FileName: Adapter
 * Author:   huang.yj
 * Date:     2019/10/24 15:51
 * Description:
 */
package com.jack.test.objectAdapter;

/**
 * 〈〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class Adapter implements Targetable{
    private Source source;

    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}