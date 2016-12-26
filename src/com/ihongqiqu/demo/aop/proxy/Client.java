package com.ihongqiqu.demo.aop.proxy;

import java.lang.reflect.Proxy;

/**
 * @author jingle1267
 * @decsription:
 * @web http://ihongqiqu.com
 * @date 12/22/16.
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("JDK 动态代理");

        Calculator target = new CalculatorImpl();
        LogHandler logHandler = new LogHandler(target);

        Calculator proxy = (Calculator) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                logHandler);

        int result = proxy.calculate(5, 8);
        System.out.println("result : " + result);
    }

}
