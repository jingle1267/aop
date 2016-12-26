package com.ihongqiqu.demo.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author jingle1267
 * @decsription:
 * @web http://ihongqiqu.com
 * @date 12/26/16.
 */
public class LogHandler implements InvocationHandler {

    private Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;

        System.out.println("start");
        long start = System.currentTimeMillis();

        result = method.invoke(target, args);

        long end = System.currentTimeMillis();
        System.out.println("end   time cost : " + (end - start));

        return result;
    }

}
