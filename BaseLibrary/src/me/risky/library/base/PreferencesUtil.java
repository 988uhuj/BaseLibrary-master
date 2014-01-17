package me.risky.library.base;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferencesUtil {
	
	public PreferencesUtil(Context context){
		
	}
	/**
	 * ��ȡ��Ӧ�ļ�ֵ
	 * @param key
	 * @return String
	 */
	public static int readMessage(Context context, String key, int value) {
		//��õ�ǰ��SharedPreferences����
		SharedPreferences message = PreferenceManager.getDefaultSharedPreferences(context);
		//��ȡ��Ϣ
		int tmp = message.getInt(key, value);
		return tmp;
	}
	/**
	 * ����ֵ��д�������ļ�
	 * @param key
	 * @param value
	 */
	public static void writeMessage(Context context, String key, int value) {
		//����һ��SharedPreferences����
		SharedPreferences message = PreferenceManager.getDefaultSharedPreferences(context);
		//�༭SharedPreferences����
		SharedPreferences.Editor editor = message.edit();
		//����һ������
		editor.putInt(key, value);
		//�ύ����
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
