package org.sgj.templatemethodpattern.demo.one;

public abstract class AbstractClass {

    protected abstract void init();
    protected abstract void start();
    protected abstract void end();

    public final void templateMethod(){
        // 调用基本方法，完成相关的逻辑
        this.init();
        this.start();
        this.end();
    }
}
