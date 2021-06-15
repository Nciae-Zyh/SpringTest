package edu.nciae.zyh.normal.normal.dao.impl;

import edu.nciae.zyh.normal.normal.dao.Factorial;

public class FactorialImpl implements Factorial {
    public FactorialImpl(){};
    @Override
    public Integer factorial(Integer integer){
        if (integer>=1){
            return integer*factorial(integer-1);
        }else if (integer==0){
            return 1;
        }else {
            return 0;
        }
    }
}
