package com.wpz.common.aop;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Man{
    @Override
    public void buy(String price) {
        System.out.println("女孩花" + price + "元买了一件裙子");
    }
}
