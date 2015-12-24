package com.sunxipeng.bridgepattern;

/**
 * Created by Administrator on 2015/12/24.
 */
public abstract class Coffee {

    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl){

        this.impl = impl;
    }

    /**
     * 咖啡具体长什么样子，
     * 由子类去实现或者拓展种类
     */
    public abstract void makeCoffee();
}
