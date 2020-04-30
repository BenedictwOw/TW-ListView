package com.myapplicationdev.android.tw_listview;


import java.util.ArrayList;

public class Module {
    private String year;
    private ArrayList module;
    private boolean prog;


    public Module(String year,ArrayList module, boolean prog) {
        this.year = year;
        this.prog = prog;
        this.module = module;
    }

    public ArrayList getModule() {
        return module;
    }

    public void setModule(ArrayList module) {
        this.module = module;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isProg() {
        return prog;
    }

    public void setProg(boolean prog) {
        this.prog = prog;
    }

}
