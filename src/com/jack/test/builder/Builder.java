/**
 * FileName: Builder
 * Author:   huang.yj
 * Date:     2019/10/24 14:46
 * Description: 建造类
 */
package com.jack.test.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈建造类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}