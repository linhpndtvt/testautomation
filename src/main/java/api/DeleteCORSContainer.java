package api;

import helper.DataTest;
import helper.GetTokenAPI;
import helper.Request;

import java.util.Hashtable;

public class DeleteCORSContainer {

    public static void sendRequest(){

        String URL = DataTest.API_URI_CONTAINERS + "/container/cors?" + "userId" + "=" + 53139 + "&" + DataTest.REGION_ID_HCM + "&" + "projectId" + "=" + "5618c09d5ca9488b8e9f52642a7089aa";

        Hashtable<String, String> header = new Hashtable<String, String>();
        header.put("Content-Type", DataTest.CONTENT_TYPE);
        header.put("Authorization", "Bearer " + GetTokenAPI.getResponseData().getToken());

        String response = Request.sendDeleteRequestWithoutBody(URL, header);
        System.out.println("Test result:  " + response);
    }

    public static void main(String[] args) {
        sendRequest();
    }

}
