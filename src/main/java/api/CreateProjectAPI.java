package api;

import helper.*;
import object.body.CreateProjectAPIObjectBody;

import java.util.Hashtable;

public class CreateProjectAPI {

    public static String sendRequest(){
        String URL = DataTest.API_URI_PROJECTS;

        CreateProjectAPIObjectBody body = new CreateProjectAPIObjectBody();
        body.setStartTime(GetCurrentTime.getCurrentDate());
        body.setEndTime("12/07/2020");
        body.setProjectName("project");
        body.setRegionId("8b1e9c9b-2136-44e4-ba7f-11ce53aee383");
        body.setQutaInGBytes(1);
        body.setUserId(DataTest.USER_ID);


        String stringBody = ConvertObjectToJson.getStringData(body);

        Hashtable<String, String> header = new Hashtable<String, String>();
        header.put("Content-Type", DataTest.CONTENT_TYPE);
        header.put("Authorization", "Bearer " + GetTokenAPI.getResponseData().getToken());

        String response = Request.sendPostRequest(URL, header, stringBody);
        System.out.println("Test result:  " + response);

        return response;
    }

    public static void main(String[] args) {
        sendRequest();
    }

}
