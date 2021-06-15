package edu.nciae.zyh.normal.normal.service;

import edu.nciae.zyh.normal.normal.dao.Factorial;
import edu.nciae.zyh.normal.normal.dao.impl.FactorialImpl;
import org.springframework.stereotype.Service;

@Service()
public class FactorialService {
    private static final Factorial factorial = new FactorialImpl();

    public Integer factorial(Integer integer) {
        return factorial.factorial(integer);
    }
}
