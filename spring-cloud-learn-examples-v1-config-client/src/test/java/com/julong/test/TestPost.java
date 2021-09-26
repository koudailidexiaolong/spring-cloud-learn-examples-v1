package com.julong.test;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * @author julong
 * @date 2021/9/17 22:56
 * @desc
 */
public class TestPost {
    public static void main(String[] args) {
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpPost post = new HttpPost("http://192.168.10.27:10089/refresh");
            CloseableHttpResponse response = httpClient.execute(post);
            System.out.println(response.getStatusLine().getStatusCode());
//            System.out.println(response.getEntity().getContent().);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
