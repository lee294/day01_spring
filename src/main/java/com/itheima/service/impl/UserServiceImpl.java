package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

import java.util.*;

/**
 * @author liuyp
 * @date 2020/08/24
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private String abc;

    private String[] stringArray;
    private List<String> stringList;
    private Set<String> stringSet;
    private Map<String,String> stringMap;
    private Properties properties;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /*public UserServiceImpl(UserDao userDao, String abc) {
        this.userDao = userDao;
        this.abc = abc;
    }*/


    public void save() {
        //userDao.save();
        //System.out.println("UserServiceImpl.save....");

        System.out.println(this.userDao);
        System.out.println(this.abc);
        System.out.println("--------------------");
        System.out.println(Arrays.toString(this.stringArray));
        System.out.println(this.stringList);
        System.out.println(this.stringSet);
        System.out.println(this.stringMap);
        System.out.println(this.properties);
    }
}
