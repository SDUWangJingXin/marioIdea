package com.luck.tool;

import com.luck.main.Main;

import java.io.*;
import java.util.Properties;
/**
 * 
 * @author ������
 * ����һ����ȡ�����ļ���Ϣ���ࡣ
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
	 * @param name �����ļ���
	 * @return �ø��ļ�����ʼ����һ��properties��
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
