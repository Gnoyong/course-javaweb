package util;

import com.alibaba.fastjson2.JSONObject;

public class HttpUtils {
    public static JSONObject success(Object o) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 20000);
        jsonObject.put("data", o);
        return jsonObject;
    }
}
