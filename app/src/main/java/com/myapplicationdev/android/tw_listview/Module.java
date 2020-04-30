package com.myapplicationdev.android.tw_listview;


public class Module {
    private String module;
    private boolean isModule;
    public Module(String module, boolean isModule) {
        this.module = module;
        this.isModule = isModule;
    }



    public boolean isModule() {
        return isModule;
    }

    public void setModule(boolean module) {
        isModule = module;
    }


    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
