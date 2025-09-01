package br.com.mariojp.solid.ocp;

import java.util.Map;

public class DiscountCalculator {
    private final Map<CustomerType, DiscountPolicy> policies;
    
    public DiscountCalculator(Map<CustomerType, DiscountPolicy> policies) {
    	this.policies = policies;
    }
    
    public double apply(double amount, CustomerType type) {
    	DiscountPolicy p = policies.getOrDefault(type, a -> a);
    	return p.apply(amount);
    }
}
