package com.ihongqiqu.demo.aop.cglib;

/**
 * @author jingle1267
 * @decsription:
 * @web http://ihongqiqu.com
 * @date 12/22/16.
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("CGLIB 动态代理");

        CalculatorInterceptor calculatorInterceptor = new CalculatorInterceptor();
        CalculatorImpl calculatorImpl = new CalculatorImpl();

        Calculator calculator = (Calculator) calculatorInterceptor.createProxyObject(calculatorImpl);
        int result = calculator.calculate(5, 8);
        System.out.println("result : " + result);
    }

}
