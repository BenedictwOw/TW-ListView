package com.myapplicationdev.android.tw_listview;

public class Module {
    public Module(String year, boolean prog) {
        this.year = year;
        this.prog = prog;
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

    private String year;
    private boolean prog;


}
