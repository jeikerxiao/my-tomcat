package com.jeiker.mytomcat.servlet;

import com.jeiker.mytomcat.model.MyRequest;
import com.jeiker.mytomcat.model.MyResponse;

import java.io.IOException;

/**
 * Description: mytomcat
 * User: jeikerxiao
 * Date: 2019/3/13 4:36 PM
 */
public class TestServlet extends MyServlet {

    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("TestServlet - doGet()");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("TestServlet - doGet()");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
