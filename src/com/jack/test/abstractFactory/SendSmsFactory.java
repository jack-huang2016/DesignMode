/**
 * FileName: SendSmsFactory
 * Author:   huang.yj
 * Date:     2019/10/24 14:06
 * Description: 工厂类实现类2
 */
package com.jack.test.abstractFactory;

/**
 * 〈工厂类实现类2〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class SendSmsFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}