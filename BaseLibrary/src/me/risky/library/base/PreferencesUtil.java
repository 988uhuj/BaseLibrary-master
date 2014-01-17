package me.risky.library.base;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferencesUtil {
	
	public PreferencesUtil(Context context){
		
	}
	/**
	 * 读取对应的键值
	 * @param key
	 * @return String
	 */
	public static int readMessage(Context context, String key, int value) {
		//获得当前的SharedPreferences对象
		SharedPreferences message = PreferenceManager.getDefaultSharedPreferences(context);
		//获取消息
		int tmp = message.getInt(key, value);
		return tmp;
	}
	/**
	 * 将键值对写入配置文件
	 * @param key
	 * @param value
	 */
	public static void writeMessage(Context context, String key, int value) {
		//创建一个SharedPreferences对象
		SharedPreferences message = PreferenceManager.getDefaultSharedPreferences(context);
		//编辑SharedPreferences对象
		SharedPreferences.Editor editor = message.edit();
		//插入一个数据
		editor.putInt(key, value);
		//提交数据
		editor.commit();
	}
	public static String readMessage(Context context, String key, String value) {
		SharedPreferences message = PreferenceManager.getDefaultSharedPreferences(context);
		String text = message.getString(key, value);
		return text;
	}
	public static void writeMessage(Context context, String key, String value) {
		SharedPreferences message = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor editor = message.edit();
		editor.putString(key, value);
		editor.commit();
	}
	
	public static float readMessage(Context context, String key, float value) {
		SharedPreferences message = PreferenceManager.getDefaultSharedPreferences(context);
		float text = message.getFloat(key, value);
		return text;
	}
	public static void writeMessage(Context context, String key, float value) {
		SharedPreferences message = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor editor = message.edit();
		editor.putFloat(key, value);
		editor.commit();
	}
	public static boolean readMessage(Context context, String key, boolean value) {
		SharedPreferences message = PreferenceManager.getDefaultSharedPreferences(context);
		boolean text = message.getBoolean(key, value);
		return text;
	}
	public static void writeMessage(Context context, String key, boolean value) {
		SharedPreferences message = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor editor = message.edit();
		editor.putBoolean(key, value);
		editor.commit();
	}
	
}
