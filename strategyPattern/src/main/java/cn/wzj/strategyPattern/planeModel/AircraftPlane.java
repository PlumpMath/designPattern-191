package cn.wzj.strategyPattern.planeModel;

import cn.wzj.strategyPattern.FunctionModel.AircraftFunction;

/**
 * Created by will on 2016/8/1.
 */
public class AircraftPlane extends Plane{
    public AircraftPlane() {
        this.function = new AircraftFunction();
    }
}
