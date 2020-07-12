package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import helper.GetTokenAPI;
import helper.Request;
import helper.DataTest;
import object.response.GetStorageUserInfoObject;

import java.io.IOException;
import java.util.Hashtable;


public class GetStorageUserInfoAPI {

    static String URL = DataTest.API_URI_USERS + DataTest.USER_ID + "?" + "regionId" + "=" + DataTest.REGION_ID_HCM;

    public static String sendRequest(){

        Hashtable<String, String> header = new Hashtable<String, String>();
        header.put("Content-Type", DataTest.CONTENT_TYPE);
        header.put("Authorization", "Bearer " + GetTokenAPI.getResponseData().getToken());
        String response = Request.sendGetRequest(URL, header);
//        System.out.println(response);
        return response;
    }

    public static GetStorageUserInfoObject getResponse(){
        ObjectMapper objectMapper = new ObjectMapper();
        String responseString = GetStorageUserInfoAPI.sendRequest();

        GetStorageUserInfoObject storageUserInfoObject = new GetStorageUserInfoObject();
        try {
            storageUserInfoObject = objectMapper.readValue(responseString, GetStorageUserInfoObject.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return storageUserInfoObject;
    }

    public static void main(String[] args) {
        System.out.println(GetStorageUserInfoAPI.getResponse().getData().getRegionId());
    }

}
