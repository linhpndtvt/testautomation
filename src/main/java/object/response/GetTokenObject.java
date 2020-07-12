package object.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.json.JSONObject;

import java.io.IOException;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class GetTokenObject {
    String errorMsg;
    Integer code;
    Boolean success;
    Integer total;
    Boolean authenticated;
    Integer userId;
    String token;


    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

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

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Boolean getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public GetTokenObject(){
        super();
    }

    public GetTokenObject(String errorMsg, Integer code, Boolean success, Integer total, Boolean authenticated, Integer userId, String token){
        this.errorMsg = errorMsg;
        this.code = code;
        this.success = success;
        this.total = total;
        this.authenticated = authenticated;
        this.userId = userId;
        this.token = token;
    }

    public static JSONObject convertToJSONObject(String apiResponse){
        ObjectMapper objectMapper = new ObjectMapper();
        JSONObject jsonObject = new JSONObject();

        try {
            GetTokenObject responseObject = objectMapper.readValue(apiResponse, GetTokenObject.class);
            Gson gson = new Gson();
            String json = gson.toJson(responseObject);
            jsonObject = new JSONObject(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

}
