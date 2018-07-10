package com.swpu.coursesystem;

import com.swpu.coursesystem.entity.Teacher;
import com.swpu.coursesystem.service.TeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursesystemApplicationTests {

	@Autowired
	private TeacherService teacherService;
	@Test
	public void test() {
		Teacher teacher = teacherService.findTeacher("123456");
		System.out.println("test...teacher:"+teacher.toString());
	}

}
