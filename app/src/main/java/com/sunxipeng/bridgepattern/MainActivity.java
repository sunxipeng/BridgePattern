package com.sunxipeng.bridgepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


/**
 * 桥接模式：
 * define:将抽象部分与现实部分分离，使他们都可以独立的进行变化
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.tv);

        //原味
        Ordinary ordinary = new Ordinary();

        //加糖
        Sugar sugar = new Sugar();

        //具体创造出来的大杯原味咖啡
        LargeCoffee largeCoffee = new LargeCoffee(ordinary);

        largeCoffee.makeCoffee();

        //具体创造出来的大杯加糖咖啡
        LargeCoffee largeCoffee1 = new LargeCoffee(sugar);

        largeCoffee1.makeCoffee();



    }
}
