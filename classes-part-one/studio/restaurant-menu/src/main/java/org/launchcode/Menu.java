package org.launchcode;

import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItem> menuList = new ArrayList<>();
    String updated;

    public Menu(ArrayList<MenuItem> menuList, String updated) {
        this.menuList = menuList;
        this.updated = updated;
    }

    public void setItem(MenuItem aMenuItem, String aUpdate) {
        menuList.add(aMenuItem);
        setUpdated(aUpdate);
        aMenuItem.setIsNew(true);
    }

    public void setUpdated(String anUpdate) {
        for (MenuItem list : menuList) {
            if (list.getIsNew()) {
                list.setIsNew(false);
            }
        }
    }

//    public ArrayList getMenuList() {
//        System.out.println(menuList);
//    }

}