package cn.wzj.templatePattern.cupExample;

/**
 * Created by will on 2016/8/9.
 */
public abstract class Cup {

    public void makeCup() {
        prepareMaterials();
        meltMaterials();
        intoMold();
        cooling();
        hook();
    }

    void prepareMaterials(){
        System.out.println("prepare materials");
    }

    void meltMaterials(){
        System.out.println("melt materials");
    }

    abstract void intoMold();

    void cooling(){
        System.out.println("cool model");
    }

    void hook(){

    }

}
