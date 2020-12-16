package com.example.designpatternsdemo.single_pattern.double_check_lock;

/**
 * @author pangliming
 * DoubleCheckLock
 */
class DoubleCheckLockSingleton {
    private DoubleCheckLockSingleton doubleCheckLockSingleton;
    private DoubleCheckLockSingleton(){}
    public DoubleCheckLockSingleton getInstance(){
        if (doubleCheckLockSingleton == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                doubleCheckLockSingleton = new DoubleCheckLockSingleton();
                return doubleCheckLockSingleton;
            }
        }
        return doubleCheckLockSingleton;
    }
}
