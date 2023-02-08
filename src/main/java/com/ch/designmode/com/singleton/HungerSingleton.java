package com.ch.designmode.com.singleton;

import javax.xml.crypto.Data;

/**
 * @author chenghao
 * @purpose：饿汉模式单例设计模式，比较简单
 * @备注：
 * @data 2023年02月08日 15:43
 */
public class HungerSingleton {
    private int age = 1;

    //先把路堵死：私有化构造器
    private HungerSingleton(){}
    private HungerSingleton(int age){this.age = age;}

    //写一个静态方法
    //打开唯一创建对象的通道: new 对象还得私有化，那么就得静态
    private static HungerSingleton hungerSingleton = new HungerSingleton();
    /*
     * 重要：我们想使用这个静态方法，只需要Singleton.getData.不想要Singleton的实例
     *      但是已经产生了，在类装载的时候就已经产生。这也是饿汉时的特点，迫不及待，
     *      管你要不要直接就产生一个实例子
     */
    private static Data getData(){
        System.out.println("你本来只是想要我，结果你连妓院都搬走了");
        return null;
    }

}
