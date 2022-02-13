package com.company.proxy;

import com.company.proxy.TaxCalculator;
import com.company.proxy.TaxInvocationHandler;
import com.company.proxy.UaTax;
import com.company.proxy.UsaTax;

import java.lang.reflect.Proxy;

public class MainTax {

    //  задача: нужно посчитать налог на сумму и этот налог зависит от страны куда отправляется товар (страна Америка или Украина)
    public static void main(String[] args) {

        //proxy
        TaxCalculator proxyCalculator =
                (TaxCalculator) Proxy.newProxyInstance(
                TaxCalculator.class.getClassLoader(),
                new Class[]{TaxCalculator.class},
                new TaxInvocationHandler(new UaTax())
        );

        double sum = 60000;
        //  в методе main инициализировали сущности (классы)  - "uaTax" и "usaTax"
        UaTax uaTax = new UaTax();
        UsaTax usaTax = new UsaTax();
        if (sum < 100000) {
            //  нужно замерить, сколько работает метод uaTax.getTax
            System.out.println("UA tax = " + proxyCalculator.getTax(sum));
        } else {
            System.out.println("USA tax = " + usaTax.getTax(sum));
        }
    }
}