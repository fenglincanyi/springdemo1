## 2个重点
* aop：面向切面编程

在原有的基础上进行扩展，而不是进行修改。符合 开闭原则
* ioc：控制反转

不通过手动 new 方式，来创建对象，而是交给Spring 容器根据配置，进行创建。从而将类的对象交给Spring 进行控制管理

2种方式来创建对象：
>（1）通过配置文件
（2）通过注解

**ioc 实现原理：** 

通过dom4j 解析 xml 文件，拿到类的全路径，然后通过反射的技术创建该类的对象，结合工厂模式返给调用方

```
<bean id=“userService” class=“com.geng.UserService”/>
public class Factory {
    public static UserService getUserService() {
        String classValue = dom4j.getValue(“userService”);
        Class clazz = Class.forName(“classValue”);
        return clazz.newInstance();
    }
}
```