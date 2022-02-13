package com.company.proxy;

// создаем контракт, чтобы потом имплементировать два существующих налога (тоесть два разных процента)
public interface TaxCalculator {
    //  создаем этому контьракту один метод посчитать налог от суммы
    double getTax(double sum);
}
