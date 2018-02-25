/**
 * Project Name:kuangkee-common
 * File Name:QueryStrParser.java
 * Package Name:com.kuangkee.common.utils.check
 * Date:2018年2月23日下午3:01:32
 * Copyright (c) 2018, 【Leon Xi】 All Rights Reserved.
 *
*/

package com.kuangkee.common.utils.check;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * ClassName:QueryStrParser <br/>
 * Date: 2018年2月23日 下午3:01:32 <br/>
 * 
 * @author Leon Xi
 * @version v1.0
 * @see
 */
public class QueryStrParser {

	/**
	 * 正则校验输入只包含字母或数字 checkStrIsNumOrAlphabet:^[A-Za-z0-9]+$. <br/>
	 * 
	 * @author Leon Xi
	 * @return
	 */
	public static boolean checkStrIsNumOrAlphabet(String content) {
		String regStr = "^[A-Za-z0-9]+$";
		return Pattern.matches(regStr, content);
	}

	/**
	 * 
	 * trimSpecialSymbol:用正则表达式替换. <br/>
	 *
	 * @author Leon Xi
	 * @param str
	 * @return
	 * @throws PatternSyntaxException
	 */
	public static String trimSpecialSymbol(String str) throws PatternSyntaxException {
		// 只允许字母和数字
		// String regEx = "[^a-zA-Z0-9]";
		// 清除掉所有特殊字符
		String regEx = "[`~!@#$%^&*()+=|{}'-:;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]"; //数字会被清掉
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.replaceAll("").trim();
	}

	/**
	 * 
	 * trimSpecialSymbol2:替换特殊字符. <br/>
	 *
	 * @author Leon Xi
	 * @param content
	 * @return
	 */
	public static String trimSpecialSymbol2(String content) {
//		String[] replaceSymbols = {"-", "%", ":"};
		String[] replaceSymbols = {"-", "%", ":"};
		String replaceChar = "" ;
		for (String symbol : replaceSymbols) {
			content = content.replace(symbol, replaceChar) ;
		}
		return content ;
	}

	public static void main(String args[]) {
		String content = "n11i%hao-111差-";
		String content2 = "ni%hao-1112-";
		
		content = QueryStrParser.trimSpecialSymbol(content);
		boolean flag = QueryStrParser.checkStrIsNumOrAlphabet(content);
		System.out.println("content-》"+content+";flag->"+flag);
		
		content2 = QueryStrParser.trimSpecialSymbol(content2);
		boolean flag2 = QueryStrParser.checkStrIsNumOrAlphabet(content2);
		System.out.println("content2-》"+content2+";flag->"+flag2);
		
		String   str   =   "*adCVs*34_a _09_b5*[/435^*&城池()^$$&*).{}+.|.)%%*(*.中国}34{45[]12.fd'*&999下面是中文的字符￥……{}【】。，；’“‘”？";  
		System.out.println(trimSpecialSymbol(str)) ;
	}
}
