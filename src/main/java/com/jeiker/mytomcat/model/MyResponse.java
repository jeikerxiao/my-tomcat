package com.jeiker.mytomcat.model;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Description: 响应
 * 基于HTTP协议的格式进行输出写入。
 * User: jeikerxiao
 * Date: 2019/3/13 4:24 PM
 */
public class MyResponse {

    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String content) throws IOException {

        // 按照 http 协议构造响应字符串
        StringBuffer httpResponse = new StringBuffer();
        httpResponse.append("HTTP/1.1 200 OK\n")
                .append("Content-Type: text/html\n")
                .append("\r\n")
                .append("<html>")
                .append("<body>")
                .append(content)
                .append("</body>")
                .append("</html>");
        // 写入输出流
        outputStream.write(httpResponse.toString().getBytes());
        outputStream.close();
    }
}
