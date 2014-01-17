/**
 * 
 */
package me.risky.library.base;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author chenupt@gmail.com
 * 
 * @Description:�����ļ�������
 * 
 * @date 2013��12��31�� ����10:48:56
 * 
 */
public class PropUtil {
	private Properties prop;
	private InputStream is;
	
	private String filename = "/project.properties";
 
	public PropUtil() {
		prop = new Properties();
		is = getClass().getResourceAsStream(filename);
		try {
			prop.load(is);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public PropUtil(String filename) {
		prop = new Properties();
		is = getClass().getResourceAsStream(filename);
		try {
			prop.load(is);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public String getProperties(String PropertyName){
       return prop.getProperty(PropertyName);
    }

}
