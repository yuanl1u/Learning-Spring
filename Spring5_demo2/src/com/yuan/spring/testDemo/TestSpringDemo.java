package com.yuan.spring.testDemo;

import com.yuan.spring.autowire.Emp;
import com.yuan.spring.bean.Orders;
import com.yuan.spring.collectionType.Book;
import com.yuan.spring.collectionType.Course;
import com.yuan.spring.collectionType.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Yuan Liu
 * @create 2021-03-12 7:05 下午
 */
public class TestSpringDemo {

    @Test
    public void testCollections(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    // 测试 对象集合
    public void testClassCollections(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    // 测试容器变量外置注入
    // 要在xml种引入util包
    @Test
    public void testExternalCollections(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        book1.test();
    }

    // 测试工厂bean
    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        // 定义普通bean
//        MyBean myBean = context.getBean("myBean", MyBean.class);
//        System.out.println("myBean = " + myBean);
        // 利用Mybean返回Course类
        Course course = context.getBean("myBean", Course.class);
        System.out.println("course = " + course);
    }

    // 测试单实例 多实例
    @Test
    public void testSingletonOrPrototype(){
        // 如果是默认的singleton, 加载spring配置文件的时候就创建了单实例；
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        // 如果scope设置为prototype，实例只有创建对象的时候才创建
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        // 不特殊设置，Spring默认是单实例，即使获取两次，两次实例的地址相同
        //book1 = com.yuan.spring.collectionType.Book@5d11346a
        //book2 = com.yuan.spring.collectionType.Book@5d11346a
        // 经过bean标签中的scope属性设置，可以变为多实例
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
    }

    @Test
    public void testBeanLife(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("4. 获取实例对象");
        System.out.println("orders = " + orders);
        // 手动让bean实例销毁
        // ApplicationContext接口没有close方法，但是实现类如ClassPathXmlApplicationContext有close方法
        ((ClassPathXmlApplicationContext)context).close();
    }

    @Test
    public void testAutoWire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println("emp = " + emp);
    }
}
