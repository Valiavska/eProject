package com.company.proxy;

// импрементируем наш контракт   TaxCalculator
public class UaTax implements TaxCalculator {
    @Override
    public double getTax(double sum) {
        return sum * 0.12;
    }
}
