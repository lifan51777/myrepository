package org.fanfan.util;

import java.io.UnsupportedEncodingException;

public class StringUtil {
	
	public static String getUTFString(String str){
		String retStr = str;
		try {
			byte[] bytes = str.getBytes("iso8859-1");
			retStr = new String(bytes, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return retStr;
	}
}
