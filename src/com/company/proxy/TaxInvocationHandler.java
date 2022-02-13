package com.company.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// проксирование - обертка TaxInvocationHandler над TaxCalculator, чтоб замерить время работы метода uaTax.getTax
public class TaxInvocationHandler implements InvocationHandler {

    private TaxCalculator taxCalculator;

    public TaxInvocationHandler(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        long startTime = System.currentTimeMillis();
        Thread.sleep(100);
        result = method.invoke(taxCalculator, args);

        System.out.println(method.getName() + " calculated in: "
        + (System.currentTimeMillis() - startTime));
        return result;
    }
}
