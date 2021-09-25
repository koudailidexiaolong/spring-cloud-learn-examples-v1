package com.julong;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.julong.action.IndexAction;

/**
 * 测试模板
 * @author julong
 * @date 2021年9月17日 下午1:41:12
 * @desc 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootApplicationTest {
	
	@Autowired
	private IndexAction indexAction;
	
	@Test
	public void exampleTest() {
		String result = indexAction.index();
		System.out.println(result);
		assertThat(result).isEqualTo("hello test");
	}
}
