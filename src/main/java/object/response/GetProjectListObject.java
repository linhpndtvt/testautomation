package object.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class GetProjectListObject {
    Integer code;
    Boolean success;
    List<GetProjectListSubObject> datas;



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

    public List<GetProjectListSubObject> getDatas() {
        return datas;
    }

    public void setDatas(List<GetProjectListSubObject> datas) {
        this.datas = datas;
    }


    public GetProjectListObject(){
        super();
    }

    public GetProjectListObject(Integer code, Boolean success, List<GetProjectListSubObject> datas) {
        this.code = code;
        this.success = success;
        this.datas = datas;
    }

    public static JSONObject convertToJSONObject(String apiResponse){

        ObjectMapper objectMapper = new ObjectMapper();
        JSONObject jsonObject = new JSONObject();

        try {
            GetProjectListObject responseObject = objectMapper.readValue(apiResponse, GetProjectListObject.class);
            Gson gson = new Gson();
            String json = gson.toJson(responseObject);
            jsonObject = new JSONObject(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
