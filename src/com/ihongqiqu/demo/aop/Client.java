package com.ihongqiqu.demo.aop;

/**
 * @author jingle1267
 * @decsription:
 * @web http://ihongqiqu.com
 * @date 12/22/16.
 */
public class Client {

    public static void main(String[] args) {
        CalculatorInterceptor calculatorInterceptor = new CalculatorInterceptor();
        CalculatorImpl calculatorImpl = new CalculatorImpl();

        Calculator calculator = (Calculator) calculatorInterceptor.createProxyObject(calculatorImpl);
        int result = calculator.calculate(5, 8);
        System.out.println("result : " + result);
    }

}
