package fairway.javabasic.Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UserDesearializer {

    public static User parse(String jsonText){

        Gson gson = new GsonBuilder().create();

        return gson.fromJson(jsonText,User.class);

    }

}
