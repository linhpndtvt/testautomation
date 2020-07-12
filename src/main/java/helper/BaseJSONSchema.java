package helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import object.response.GetTokenObject;
import org.apache.log4j.Logger;
import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

public class BaseJSONSchema {
	static Logger logger = Logger.getLogger(BaseJSONSchema.class);

	public static boolean validateSchema(String schemaFile, Object jsonObject) {
		boolean status = false;
		try {
			InputStream inputStream = new FileInputStream(schemaFile);
			JSONObject rawSchema = new JSONObject(new JSONTokener(inputStream));
			Schema schema = SchemaLoader.load(rawSchema);

			schema.validate(jsonObject);
			status = true;
			logger.info("Schema validation of " + jsonObject.getClass().getSimpleName() + ": PASSED");
		} catch (ValidationException | IOException e) {
			logger.error(e.getMessage());
			((ValidationException) e).getCausingExceptions().stream().map(ValidationException::getMessage)
					.forEach(ValidationException -> {
						logger.error(ValidationException.toString());
					});
		}
		return status;
	}

    public static void main(String[] args) {
        GetTokenObject tokenObject = new GetTokenObject();
        JSONObject jsonObject = tokenObject.convertToJSONObject(GetTokenAPI.sendRequest());

        String file = "src/main/resources/test.json";
        validateSchema(file, jsonObject);
    }
}
