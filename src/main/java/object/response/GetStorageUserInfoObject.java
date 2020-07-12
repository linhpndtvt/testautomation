package object.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.json.JSONObject;

import java.io.IOException;

public class GetStorageUserInfoObject {
    Integer code;
    Boolean success;
    GetStorageUserInfoSubObject data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public GetStorageUserInfoSubObject getData() {
        return data;
    }

    public void setData(GetStorageUserInfoSubObject data) {
        this.data = data;
    }


    public GetStorageUserInfoObject(){
        super();
    }

    public GetStorageUserInfoObject(Integer code, Boolean success, GetStorageUserInfoSubObject data) {
        this.code = code;
        this.success = success;
        this.data = data;
    }

    public static JSONObject convertToJSONObject(String apiResponse){

        ObjectMapper objectMapper = new ObjectMapper();
        JSONObject jsonObject = new JSONObject();

        try {
            GetStorageUserInfoObject responseObject = objectMapper.readValue(apiResponse, GetStorageUserInfoObject.class);
            Gson gson = new Gson();
            String json = gson.toJson(responseObject);
            jsonObject = new JSONObject(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
