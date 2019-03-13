package com.jeiker.mytomcat.servlet;

import com.jeiker.mytomcat.model.MyRequest;
import com.jeiker.mytomcat.model.MyResponse;

/**
 * Description: MyServlet API
 * User: jeikerxiao
 * Date: 2019/3/13 4:31 PM
 */
public abstract class MyServlet {

    public abstract void doGet(MyRequest myRequest, MyResponse myResponse);

    public abstract void doPost(MyRequest myRequest, MyResponse myResponse);

    // service 方法中分发请求到doGet和doPost中
    public void service(MyRequest myRequest, MyResponse myResponse) {
        if (myRequest.getMethod().equalsIgnoreCase("POST")) {
            doPost(myRequest, myResponse);
        } else if (myRequest.getMethod().equalsIgnoreCase("GET")) {
            doGet(myRequest, myResponse);
        }
    }
}
