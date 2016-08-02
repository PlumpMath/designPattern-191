package cn.wzj.strategyPattern.planeModel;

import cn.wzj.strategyPattern.FunctionModel.InvestigationFunction;

/**
 * Created by will on 2016/8/1.
 */
public class InvestigationPlane extends Plane{
    public InvestigationPlane(){
        this.function = new InvestigationFunction();
    }
}
