package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import helper.GetTokenAPI;
import helper.Request;
import helper.DataTest;
import object.response.GetProjectListObject;


import java.io.IOException;
import java.util.Hashtable;


public class GetProjectListAPI {

    static String URL = DataTest.API_URI_PROJECTS + "?" + "userId" + "=" + DataTest.USER_ID  + "&regionId" + "=" + DataTest.REGION_ID_HCM;

    public static String sendRequest(){
        Hashtable<String, String> header = new Hashtable<String, String>();
        header.put("Content-Type", DataTest.CONTENT_TYPE);
        header.put("Authorization", "Bearer " + GetTokenAPI.getResponseData().getToken());
        String response = Request.sendGetRequest(URL, header);
        return response;
    }

    public static GetProjectListObject getResponse(){
        ObjectMapper objectMapper = new ObjectMapper();
        String responseString = GetProjectListAPI.sendRequest();

        GetProjectListObject projectListObject = new GetProjectListObject();

        try {
            projectListObject = objectMapper.readValue(responseString, GetProjectListObject.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return projectListObject;
    }

    public static void main(String[] args) {
        System.out.println(GetProjectListAPI.getResponse().getDatas().get(0).getProjectId());
    }


}
