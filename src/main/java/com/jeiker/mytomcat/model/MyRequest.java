package com.jeiker.mytomcat.model;

import java.io.IOException;
import java.io.InputStream;

/**
 * Description: MyRequest 请求
 * 通过输入流，对HTTP协议进行解析，拿到了HTTP请求头的方法以及URL。
 * User: jeikerxiao
 * Date: 2019/3/13 4:15 PM
 */
public class MyRequest {

    private String method;
    private String url;

    public MyRequest(InputStream inputStream) throws IOException {

        /**
         * GET /test HTTP/1.1
         * Host: localhost:8080
         * Connection: keep-alive
         * Cache-Control: max-age=0
         * Upgrade-Insecure-Requests: 1
         * User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.119 Safari/537.36
         * Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng;q=0.8
         * Accept-Encoding: gzip, deflate, br
         * Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,zh-TW;q=0.7
         */
        String httpRequest = "";
        byte[] httpRequestBytes = new byte[1024];

        int length = 0;
        // 从输入流中读取数据到字节数组
        if ((length = inputStream.read(httpRequestBytes)) > 0) {
            httpRequest = new String(httpRequestBytes, 0, length);
            String httpHead = httpRequest.split("\n")[0];
            method = httpHead.split("\\s")[0];
            url = httpHead.split("\\s")[1];
            System.out.println(this);
        }
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
