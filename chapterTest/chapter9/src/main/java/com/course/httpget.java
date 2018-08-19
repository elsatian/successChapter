package com.course;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.ResourceBundle;

public class httpget {
    private String url;
    private ResourceBundle bundle;

    @BeforeTest
    public void beforeTest() {
        bundle=ResourceBundle.getBundle("application");
        url = bundle.getString("test.url");


    }

    public void testGetCookies() throws IOException {
        String result;
        String uri=bundle.getString("getCookies.uri");
        String testUrl=this.url+uri;

        HttpGet get = new HttpGet(testUrl);
        HttpClient client=new DefaultHttpClient();
        HttpResponse response=client.execute(get);


        result= EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println("result");
    }
}
