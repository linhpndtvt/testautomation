package helper;

import com.fasterxml.jackson.databind.ObjectMapper;
import object.response.GetTokenObject;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.util.List;

public class GetTokenAPI {
    private static final CloseableHttpClient httpClient = HttpClients.createDefault();

    public static String sendRequest(){
        HttpGet request = new HttpGet(DataTest.ACCOUNT_SERVICE_URI + "/user/token");

        request.addHeader("Content-Type", DataTest.CONTENT_TYPE);
        request.addHeader("access_key", DataTest.ACCESS_KEY);
        request.addHeader("timestamp", DataTest.TIMESTAMP);
        request.addHeader("checksum", DataTest.CHECKSUM);

        String apiResponse = null;
        try {
            CloseableHttpResponse response;
            response = httpClient.execute(request);

//            System.out.println( "This is convertJsonObject 1:  " + request.getRequestLine().getMethod());

            HttpClientContext context = HttpClientContext.create();
            HttpHost target = context.getTargetHost();
            List<URI> redirectLocations = context.getRedirectLocations();
            URI location = URIUtils.resolve(request.getURI(), target, redirectLocations);
//            System.out.println("Final HTTP location: " + location.toASCIIString());

//            System.out.println("RespondTest get Fragment: " + location.getFragment());

//            System.out.println(response.getStatusLine().toString());

            HttpEntity entity = response.getEntity();
            Header headers = entity.getContentType();

//            System.out.println("Get content type: " + entity.getContentType());


//            System.out.println("This is request header: " + headers);
            if (entity != null) {
                String temp = EntityUtils.toString(entity);
//                System.out.println("This is api response: " + temp);
                apiResponse = temp;

            }
        }
        catch (Exception e){
                e.printStackTrace();
        }
        return apiResponse;
    }


    public static GetTokenObject getResponseData(){
        ObjectMapper objectMapper = new ObjectMapper();
        String responseString = GetTokenAPI.sendRequest();

        GetTokenObject tokenObject = new GetTokenObject();
        try {
            tokenObject = objectMapper.readValue(responseString, GetTokenObject.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tokenObject;
    }

    public static void main(String[] args) {
        System.out.println(GetTokenAPI.getResponseData().getToken());
//        sendRequest();
    }
}
