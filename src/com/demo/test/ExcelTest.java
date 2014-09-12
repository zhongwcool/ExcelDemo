package com.demo.test;


import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.demo.domain.Student;
import com.demo.utils.ExcelFileUtil;

public class ExcelTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExcelFileUtil excel = new ExcelFileUtil();
		//数据初始化
		List<Student> stus = new ArrayList<Student>();
		Student stu1 = new Student(1,"张三",new Date(),"测试数据001");
		Student stu2 = new Student(1,"李四",new Date(),"测试数据002");
		Student stu3 = new Student(1,"王五",new Date(),"测试数据003");
		Student stu4 = new Student(1,"测试1",new Date(),"测试数据004");
		Student stu5 = new Student(1,"测试2",new Date(),"测试数据005");
		Student stu6 = new Student(1,"测试3",new Date(),"测试数据006");
		
		stus.add(stu1);
		stus.add(stu2);
		stus.add(stu3);
		stus.add(stu4);
		stus.add(stu5);
		stus.add(stu6);
		
		File file = excel.write("学生信息", stus, Student.class);
		System.out.println("文件存放路劲为：" + file.getPath());
		
		
	}

}
