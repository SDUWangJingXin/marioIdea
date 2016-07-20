package com.luck.tool;

import com.luck.main.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 
 * @author ������
 * ����һ����ȡspring��������
 */
public class ApplicationUtil 
{
	private ApplicationContext ac=null;
	/**
	 * 
	 * @param step ��step��
	 */
	public ApplicationUtil(int step)
	{
		System.out.println(Main.BATH_PATH);
		if(step==-1)
		{
			ac=new FileSystemXmlApplicationContext("file:"+Main.BATH_PATH+"/beans.map.default.xml");
	//		ac=new ClassPathXmlApplicationContext();
		}else
	//	ac=new ClassPathXmlApplicationContext("beans.map"+step+".xml");
		ac=new FileSystemXmlApplicationContext("file:"+Main.BATH_PATH+"/beans.map"+step+".xml");
	}
	public  ApplicationContext getContext()
	{
		return ac;
	}
}
 