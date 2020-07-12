import api.GetProjectListAPI;
import api.GetStorageUserInfoAPI;
import helper.BaseJSONSchema;
import object.response.GetProjectListObject;
import object.response.GetStorageUserInfoObject;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestClass {



    @Test
    public void verifySchemaStorageUserInfoAPI(){
        JSONObject jsonObject = new JSONObject();
        jsonObject = GetStorageUserInfoObject.convertToJSONObject(GetStorageUserInfoAPI.sendRequest());
        BaseJSONSchema.validateSchema("src/main/resources/get_storage_user_info_schema.json",jsonObject);
    }

    @Test
    public void verifySchemaProjectListAPI(){
        JSONObject jsonObject = new JSONObject();
        jsonObject = GetProjectListObject.convertToJSONObject(GetProjectListAPI.sendRequest());
        BaseJSONSchema.validateSchema("src/main/resources/get_project_list_schema",jsonObject);
    }

 }
