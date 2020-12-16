package com.example.designpatternsdemo.single_pattern.hungry;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pangliming
 */
class Company {

    private List<Staff> allStaffs = new ArrayList<>();

    public void addStaff(Staff staff){
        allStaffs.add(staff);
    }

    public void showAllStaffs(){
        for (Staff staff : allStaffs) {
            System.out.println(staff.toString());
        }
    }
}
