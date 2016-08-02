package cn.wzj.strategyPattern.Simulator;

import cn.wzj.strategyPattern.planeModel.AircraftPlane;
import cn.wzj.strategyPattern.planeModel.InvestigationPlane;
import cn.wzj.strategyPattern.planeModel.Plane;

/**
 * Created by will on 2016/8/1.
 */
public class PlaneSimulator {
    public static void main(String[] args) {
        Plane aircraft = new AircraftPlane();
        System.out.println("======aircraft======");
        aircraft.fly();
        aircraft.appearance();
        aircraft.performFunction();

        Plane investigation = new InvestigationPlane();
        System.out.println("======investigation======");
        investigation.fly();
        investigation.appearance();
        investigation.performFunction();
    }
}
