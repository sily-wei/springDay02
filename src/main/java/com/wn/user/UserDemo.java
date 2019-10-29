package com.wn.user;

import lombok.Data;

/**
 * @author weining
 * @date 2019/10/29 16:21
 */
@Data
public class UserDemo {
    private String id;
    private String username;

    private User user;

    public UserDemo() {
    }

    public UserDemo(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public void init(){
        System.out.println("我是一个初始化方法");
    }

    public void destory(){
        System.out.println("我是一个结束方法");
    }
}
