package com.myapplicationdev.android.tw_listview;


public class Module {
    private String year;
    private String module;
    private boolean prog;

    public Module(String year,String module, boolean prog) {
        this.year = year;
        this.prog = prog;
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
