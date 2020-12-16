package com.example.designpatternsdemo.single_pattern.hungry;

/**
 * @author pangliming
 */
class Test {
    public static void main(String[] args) {
        Company company = new Company();
        CEO ceo1 = CEO.getCEO();
        CEO ceo2 = CEO.getCEO();
        company.addStaff(ceo1);
        company.addStaff(ceo2);

        VP vp1 = new VP();
        company.addStaff(vp1);
        VP vp2 = new VP();
        company.addStaff(vp2);

        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();
        company.addStaff(staff1);
        company.addStaff(staff2);
        company.addStaff(staff3);
        company.showAllStaffs();
    }
}
