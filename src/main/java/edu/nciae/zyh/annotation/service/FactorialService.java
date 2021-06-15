package edu.nciae.zyh.annotation.service;

import edu.nciae.zyh.annotation.dao.Factorial;
import edu.nciae.zyh.annotation.dao.impl.FactorialImpl;
import org.springframework.stereotype.Service;

@Service()
public class FactorialService {
    private static final Factorial factorial = new FactorialImpl();

    public Integer factorial(Integer integer) {
        return factorial.factorial(integer);
    }
}
