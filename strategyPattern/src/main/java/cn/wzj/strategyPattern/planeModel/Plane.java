package cn.wzj.strategyPattern.planeModel;

import cn.wzj.strategyPattern.FunctionModel.Function;

/**
 * Created by will on 2016/8/1.
 */
public class Plane {
    Function function;
    public void fly(){
        System.out.println("can fly!");
    }
    public void appearance(){
        System.out.println("has two wings");
    }
    public void performFunction(){
        function.whatFunction();
    }

}
