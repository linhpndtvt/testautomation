package api;

import helper.ConvertObjectToJson;
import helper.DataTest;
import helper.GetTokenAPI;
import helper.Request;
import object.body.UpdateStorageUserPasswordActionInfoObjectBody;
import object.body.UpdateStorageUserPasswordObjectBody;

import java.util.Hashtable;

public class UpdateStorageUserPasswordAPI {
    public static void sendRequest(){

        String URL = DataTest.API_URI_USERS + "/" + 53139 + "/action?" + DataTest.REGION_ID_HCM;

        UpdateStorageUserPasswordActionInfoObjectBody sub_body = new UpdateStorageUserPasswordActionInfoObjectBody();
        sub_body.setOldPass("gFz-Y5me1");
        sub_body.setNewPass("gFz-Y5me1");
        sub_body.setConfirmNewPass("gFz-Y5me1");

        UpdateStorageUserPasswordObjectBody body = new UpdateStorageUserPasswordObjectBody();
        body.setActionName("changePassword");
        body.setActionInfo(sub_body);

        String paramBody = ConvertObjectToJson.getStringData(body);

        Hashtable<String, String> header = new Hashtable<String, String>();
        header.put("Content-Type", DataTest.CONTENT_TYPE);
        header.put("Authorization", "Bearer " + GetTokenAPI.getResponseData().getToken());

        String response = Request.sendPutRequest(URL, header, paramBody);
        System.out.println("Test result:  " + response);

    }

    public static void main(String[] args) {
        sendRequest();
    }
}
