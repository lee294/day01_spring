package com.itheima.test;

import com.itheima.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author liuyp
 * @date 2020/08/24
 */
public class SpringDiTest {
    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        /*UserDao userDao = (UserDao) app.getBean("userDao");
        System.out.println(userDao);*/

        UserService userService = (UserService) app.getBean("userService");
        //System.out.println(userService);
        userService.save();
    }

    @Test
    public void test2(){
        //从磁盘路径里加载xml文件
        ApplicationContext app = new FileSystemXmlApplicationContext("D:\\study\\code\\day01_spring\\src\\main\\resources.applicationContext.xml");
        // UserService userService = (UserService) app.getBean("userService");
        // userService.save();

        //根据类型，从容器里查找bean对象。假如：UserService类型，在容器里有两个bean对象，会报错
        // UserService userService1 = app.getBean(UserService.class);
        // userService1.save();

        // UserService userService = app.getBean("userService", UserService.class);
        // userService.save();

        //获取容器里bean的数量
        // int beanDefinitionCount = app.getBeanDefinitionCount();
        // System.out.println(beanDefinitionCount);

        // String[] beanDefinitionNames = app.getBeanDefinitionNames();
        // for (String beanDefinitionName : beanDefinitionNames) {
        //     System.out.println(beanDefinitionName);
        // }

        // String[] names = app.getBeanNamesForType(UserService.class);
        // for (String name : names) {
        //     System.out.println(name);
        // }
    }
}
