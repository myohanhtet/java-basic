package fairway.javabasic.Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GenericDeserlizer<T> {

    Class<T> type;

    public GenericDeserlizer(Class<T> type){
        this.type = type;
    }

    public T parse(String text){
        Gson gson = new GsonBuilder().create();
        T d = gson.fromJson(text,type);
        return d;
    }

}
