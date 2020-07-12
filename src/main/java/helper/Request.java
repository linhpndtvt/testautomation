package helper;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;

public class Request {

    public static final CloseableHttpClient httpClient = HttpClients.createDefault();

    public static String sendGetRequest(String URL, Hashtable<String, String> header){

        HttpGet httpGet = new HttpGet(URL);
        header.forEach((k,v) -> httpGet.addHeader(k,v));

        String apiResponse = null;
        try {
            CloseableHttpResponse response;
            response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                apiResponse = EntityUtils.toString(entity);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        } return apiResponse;

    }

    public static String sendPostRequest(String URL, Hashtable<String, String> header, String body) {

        HttpPost httpPost = new HttpPost(URL);
        StringEntity stringEntity = null;

        try {
            stringEntity = new StringEntity(body);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        header.forEach((k,v) -> httpPost.setHeader(k,v));
        httpPost.setEntity(stringEntity);

        String apiResponse = null;
        try {
            HttpResponse response = httpClient.execute(httpPost);
            apiResponse = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        } return apiResponse;
    }


    //DELETE request without request body
    public static String sendDeleteRequestWithoutBody(String URL, Hashtable<String, String> header) {

        HttpDelete httpDelete = new HttpDelete(URL);

        header.forEach((k,v) -> httpDelete.setHeader(k,v));

        String apiResponse = null;
        try {
            HttpResponse response = httpClient.execute(httpDelete);
            apiResponse = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        } return apiResponse;
    }


    //DELETE request with params in body
    public static String sendDeleteRequest(String URL, Hashtable<String, String> header, String body){

        HttpDeleteWithBody httpDelete = new HttpDeleteWithBody(URL);
        StringEntity stringEntity = null;

        try {
            stringEntity = new StringEntity(body);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        header.forEach((k,v) -> httpDelete.setHeader(k,v));
        httpDelete.setEntity(stringEntity);

        String apiResponse = null;
        try {
            CloseableHttpResponse response;
            response = httpClient.execute(httpDelete);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String temp = EntityUtils.toString(entity);
                apiResponse = temp;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        } return apiResponse;
    }

    public static String sendPutRequest(String URL, Hashtable<String, String> header, String body) {

        HttpPut httpPut = new HttpPut(URL);
        StringEntity stringEntity = null;

        try {
            stringEntity = new StringEntity(body);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        header.forEach((k,v) -> httpPut.setHeader(k,v));
        httpPut.setEntity(stringEntity);

        String apiResponse = null;
        try {
            HttpResponse response = httpClient.execute(httpPut);
            apiResponse = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        } return apiResponse;
    }

}
