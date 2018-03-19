package org.supermarket.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class TestFreeMarker {

	@Test
	public void test() throws Exception {
		//1.准备模型数据
		Map<String, Object> model = new HashMap<>();
		model.put("name", "FreeMarker!");
		
		//用Map来模拟实体类
		Map<String, Object> Student = new HashMap<>();
		Student.put("name", "李晓宇");
		Student.put("age", 20);
		Student.put("height", 180);
		model.put("Student", Student);
		
		//list传值
		List<String> list = Arrays.asList("a","b","c","d");
		model.put("list", list);
		
		//2.读取模板文件
		Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
		configuration.setDirectoryForTemplateLoading(new File("src/test/resources"));
		configuration.setDefaultEncoding("UTF-8");
		Template template = configuration.getTemplate("dome.ftl");
		
		//3.使用FreeMarker合成
//		Writer out = new OutputStreamWriter(System.out); //输出到控制台
		Writer out = new OutputStreamWriter(new FileOutputStream(new File("C:/Users/Administrator/Desktop/b.html")));//输出到桌面
		template.process(model, out);
		System.out.println("success!");
	}

}
