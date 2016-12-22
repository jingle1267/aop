package com.ihongqiqu.demo.aop;

/**
 * @author jingle1267
 * @decsription:
 * @web http://ihongqiqu.com
 * @date 12/22/16.
 */
public class CalculatorImpl implements Calculator {

    @Override
    public int calculate(int a, int b) {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return a + b;
    }

}
