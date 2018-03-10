package com.cidm4385.wt.computerbuildchecklistfinal;

public class CheckListItem {


    public String mItemName;
    public boolean mChecked;


    public String getItemName(){
        return mItemName;
    }

    public void setItemName(String itemName){
        mItemName = itemName;
    }

    public boolean isChecked(){
        return mChecked;
    }

    public void setChecked(boolean checked){
        mChecked = checked;
    }
}

