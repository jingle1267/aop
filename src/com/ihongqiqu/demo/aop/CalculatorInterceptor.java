package com.ihongqiqu.demo.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author jingle1267
 * @decsription:
 * @web http://ihongqiqu.com
 * @date 12/22/16.
 */
public class CalculatorInterceptor implements MethodInterceptor {

    Object targetObject;

    public Object createProxyObject(Object targetObject) {
        this.targetObject = targetObject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.targetObject.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;

        System.out.println("start");
        long start = System.currentTimeMillis();

        result = method.invoke(targetObject, objects);

        long end = System.currentTimeMillis();
        System.out.println("end   time cost : " + (end - start));

        return result;
    }
}
