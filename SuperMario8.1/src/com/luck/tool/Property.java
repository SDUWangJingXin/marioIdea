package com.luck.tool;

import com.luck.main.Main;

import java.io.*;
import java.util.Properties;
/**
 * 
 * @author 王镜鑫
 * 这是一个获取配置文件信息的类。
 *
 */
public class Property 
{
	public static Properties pro=null;
	static
	{
		if(pro==null)pro=new Properties();
	}
	/**
	 * 
	 * @param name 配置文件名
	 * @return 用该文件名初始化的一个properties类
	 */
	public static Properties getPro(String name)
	{
		if(pro==null)pro=new Properties();
		InputStream in= null;
		try
		{
			in = new FileInputStream(new File(Main.BATH_PATH+name));
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println(name);
		try
		{
			pro.load(in);
		} catch (IOException e)  
		{
			e.printStackTrace();
		}
		return pro;
	}
}
