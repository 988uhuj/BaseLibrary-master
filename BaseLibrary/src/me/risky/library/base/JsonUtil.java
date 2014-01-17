/**
 * 
 */
package me.risky.library.base;

import java.util.Map;

import org.json.JSONException;
import org.json.JSONStringer;

/**
 * @author chenupt@gmail.com
 *
 * @Description:TODO
 *
 * @date 2013年12月20日 下午10:02:56 
 *
 */
public class JsonUtil {
	public static String mapToJson(Map<String, Object> map) throws JSONException{
		if (map != null) {
			JSONStringer json = new JSONStringer();
			json.object();
			for (String key : map.keySet()) {
				json.key(key).value(map.get(key));
			}
			json.endObject();
			return json.toString();
		}
		return null;
	}
}
