package helper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ConvertObjectToJson {

    public static String getStringData(Object object) {

        ObjectMapper Obj = new ObjectMapper();
        String jsonStr = null;

        try {
            jsonStr = Obj.writeValueAsString(object);
//            System.out.println(jsonStr);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }
}
