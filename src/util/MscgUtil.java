package util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/****
 * 本类中放一些抽象的静态方法 如字符串处理、时间处理等等，按需添加
 * 
 * 便于复用，同时也直接用于以后的项目中 注意一定写好详细的注释
 * 
 * @author qinyao
 * 
 */
public class MscgUtil {

	private static String dateFormat = "yyyyMMdd";
	private static String datetimeFormat = "yyyyMMddHHmmss";

	/**
	 * 任意类型转换为Float
	 * 
	 * @param obj
	 * @return
	 * @author qinyao
	 */
	public static Float parseFloat(Object obj) {
		if (obj == null) {
			return null;
		}
		if ((obj instanceof Float)) {
			return (Float) obj;
		}
		return new Float(obj.toString());
	}

	/**
	 * 任意类型转换为Long
	 * 
	 * @param obj
	 * @return
	 * @author qinyao
	 */
	public static Long parseLong(Object obj) {
		if (obj == null) {
			return null;
		}
		if ((obj instanceof Long)) {
			return (Long) obj;
		}
		return new Long(obj.toString());
	}

	/**
	 * 任意类型转换为Integer
	 * 
	 * @param obj
	 * @return
	 * @author qinyao
	 */
	public static Integer parseInt(Object obj) {
		if (obj == null) {
			return null;
		}
		if ((obj instanceof Integer)) {
			return (Integer) obj;
		}
		return new Integer(obj.toString());
	}

	/**
	 * 判断输入的字符串参数是否为空
	 * 
	 * @param input
	 * @return boolean 空则返回true,非空则false
	 * @author qinyao
	 */

	public static boolean isEmpty(String input) {
		return null == input || 0 == input.length()
				|| 0 == input.replaceAll("\\s", "").length();
	}

	/**
	 * 判断输入的字节数组是否为空
	 * 
	 * @param bytes
	 * @return boolean 空则返回true,非空则false
	 * @author qinyao
	 */
	public static boolean isEmpty(byte[] bytes) {
		return null == bytes || 0 == bytes.length;
	}

	/***
	 * 获取当前日期的字符串
	 * 
	 * @return
	 * @author qinyao
	 */
	public static String getCurrentDateStr() {
		return new SimpleDateFormat(dateFormat).format(new Date());
	}

	/***
	 * 获取当前时间的字符串
	 * 
	 * @return
	 * @author qinyao
	 */
	public static String getCurrentTimeStr() {
		return new SimpleDateFormat(datetimeFormat).format(new Date());
	}

	/**
	 * 将double类型的数字保留两位小数（四舍五入）
	 * 
	 * @param number
	 * @return
	 * @author qinyao
	 */
	public static String formatNumber(double number) {
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#0.00");
		return df.format(number);
	}

}
