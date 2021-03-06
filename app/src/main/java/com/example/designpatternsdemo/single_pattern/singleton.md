# 单例模式

* 定义

* 使用场景

* 单例模式类图

* 单例示例

  ## 定义

  确保某个类只有一个实例，而且自动实例化并向整个系统提供实例。

  ## 使用场景

  确保某个类只有一个对象的场景，避免产生多个对象消耗资源，或者某种对象的类型只应该有且只有一个对象。

  例如，创建一个对象消耗的资源过多，如访问IO和数据库等资源。

  ## 单例模式类图

  ![](https://github.com/pangliming/DesignPatternsDemo/blob/master/app/src/main/java/com/example/designpatternsdemo/single_pattern/singleton.png)

  **角色：**

  1. Client:高层客户端

  2. Singleton:单例类

  **关键点**

  - 构造函数不对外开放，一般为private

  - 通过一个静态方法或枚举返回单例对象

  - 确保单例类的对象有且只有一个，尤其是在多线程的环境下
  
  - 确保单例类对象在反序列化不会重新构建对象
  
  ##示例
  
  - 懒汉式
  
  - 饿汉式
  
  - doubleCheckLock(DCL)
  
  - 静态内部类实现单例模式
  
  - 枚举单例
  
    ### 懒汉式 
  
    
    
    ```java
    /**
     * @author pangliming
     * 懒汉模式
     */
    class Singleton {
    
        private static Singleton ourInstance;
        private Singleton(){
            
        }
      
        public static synchronized Singleton getSingleton(){
    
            if (null == ourInstance) {
                ourInstance = new Singleton();
            }
    
            return ourInstance;
        }
    }
    ```
    
    优点：单例只有在使用时才会被实例化，一定程度上节约了开销。
    
    缺点：在需要时才会被创建，反应慢，最大的问题每次调用getSingleton都进行同步,造成不必要的内存开销。
    
    一般不建议使用这种模式。
    
    ### 饿汉式
    
    ```java
    
    
    /**
     * @author pangliming
     * 单例模式：饿汉式 
     */
    class CEO{
        private static CEO ourInstance = new CEO();
    
        private CEO(){ }
    
        public static CEO getCEO(){
            return ourInstance;
        }
    
       
    }
    ```
    
    ### DoubleCheckLock(DCL)
    
    ```java
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
    ```
    
    
  
  
  
  



  

  

  

  

  

  

  


