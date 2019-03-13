package com.jeiker.mytomcat;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: mytomcat
 * User: jeikerxiao
 * Date: 2019/3/13 4:40 PM
 */
public class ServletMappingConfig {

    public static List<ServletMapping> servletMappingList = new ArrayList<ServletMapping>();

    static {
        servletMappingList.add(
                new ServletMapping(
                        "helloServlet",
                        "/hello",
                        "com.jeiker.mytomcat.servlet.HelloServlet"));
        servletMappingList.add(
                new ServletMapping(
                        "testServlet",
                        "/test",
                        "com.jeiker.mytomcat.servlet.TestServlet"));
    }
}
