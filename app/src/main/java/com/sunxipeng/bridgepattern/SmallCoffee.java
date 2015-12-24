package com.sunxipeng.bridgepattern;

import android.util.Log;

/**
 * Created by Administrator on 2015/12/24.
 */
public class SmallCoffee extends Coffee {


    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {


        /**
         * 子类创造出小杯咖啡
         */
        Log.d("我是小杯杯的咖啡", "小杯的" + impl + "咖啡");
    }
}
