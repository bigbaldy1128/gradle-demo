package com.qihoo.test;

import com.qihoo.test.api.Test;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by wangjinzhao on 2018/7/4.
 */
public class App {
    public static void main(String[] args) {
        Test test=new Test();
        test.setStr("456");
        System.out.println(StringUtils.isBlank(test.getStr()));
    }
}
