package api;

import helper.ConvertObjectToJson;
import helper.DataTest;
import helper.GetTokenAPI;
import helper.Request;
import object.body.DeleteProjectObjectBody;

import java.util.Hashtable;

public class DeleteProjectAPI {
    public static void sendRequest(){

        String URL = DataTest.API_URI_PROJECTS + "/" + "1f5c67173d844d3ab6a0f562bca7b54b";
        DeleteProjectObjectBody body = new DeleteProjectObjectBody();
        body.setRegionId("8b1e9c9b-2136-44e4-ba7f-11ce53aee383");
        body.setUserId(53512);

        String stringBody = ConvertObjectToJson.getStringData(body);

        Hashtable<String, String> header = new Hashtable<String, String>();
        header.put("Content-Type", DataTest.CONTENT_TYPE);
        header.put("Authorization", "Bearer " + GetTokenAPI.getResponseData().getToken());

        String response = Request.sendDeleteRequest(URL, header, stringBody);
        System.out.println("Test result:  " + response);

    }

    public static void isDeleted(){

    }

    public static void main(String[] args) {
        sendRequest();
    }
}
