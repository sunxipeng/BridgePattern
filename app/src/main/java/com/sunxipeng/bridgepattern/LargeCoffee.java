package com.sunxipeng.bridgepattern;

import android.util.Log;

/**
 * Created by Administrator on 2015/12/24.
 */
public class LargeCoffee extends Coffee {


    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {

        /**
         * 子类创造出大杯咖啡
         *
         * 父类有的变量，子类同样可以拿来用，因此只需要将类传入父类即可
         * 省去了多次定义变量
         */
        Log.d("我是大杯的咖啡","大杯的"+impl.addSomething()+"咖啡");
    }
}
