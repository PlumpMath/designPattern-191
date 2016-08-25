package cn.wzj.templatePattern.simulator;

import cn.wzj.templatePattern.cupExample.CupwithHolder;
import cn.wzj.templatePattern.cupExample.CupwithoutHolder;

/**
 * Created by will on 2016/8/9.
 */
public class CupSimulator {

    public static void main(String[] args){
        CupwithHolder cupwithHolder = new CupwithHolder();
        cupwithHolder.makeCup();

        System.out.println("========================");

        CupwithoutHolder cupwithoutHolder = new CupwithoutHolder();
        cupwithoutHolder.makeCup();
    }
}
