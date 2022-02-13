package com.company.proxy;

// импрементируем наш контракт   TaxCalculator
public class UsaTax implements TaxCalculator {
    @Override
    public double getTax(double sum) {
        return sum * 0.2;
    }
}
