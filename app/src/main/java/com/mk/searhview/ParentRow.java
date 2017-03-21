package com.mk.searhview;

import java.util.ArrayList;

/**
 * Created by MK on 21/03/2017.
 */

public class ParentRow {
    private String name;
    private ArrayList<ChildRow> childlist;

    public ParentRow(String name, ArrayList<ChildRow> childlist) {
        this.name = name;
        this.childlist = childlist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ChildRow> getChildlist() {
        return childlist;
    }

    public void setChildlist(ArrayList<ChildRow> childlist) {
        this.childlist = childlist;
    }
}
