/**
 * FileName: Adapter
 * Author:   huang.yj
 * Date:     2019/10/24 15:36
 * Description:
 */
package com.jack.test.adapter;

/**
 * 〈〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class Adapter extends Source implements Targetable{
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}