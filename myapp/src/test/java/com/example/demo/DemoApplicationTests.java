package com.example.demo;

import com.example.demo.mylib.CachedDataLib;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private CachedDataApp cachedDataApp;

	@Autowired
	private CachedDataLib cachedDataLib;

	@Test
	void cachedDataAppTest() {
		var firstResult = cachedDataApp.get("first", "first");
		var secondResult = cachedDataApp.get("second", "second");
		assertThat(firstResult).isEqualTo("first/first");
		assertThat(secondResult).isEqualTo("second/second");
	}

	@Test
	void cachedDataLibTest() {
		var firstResult = cachedDataLib.get("first", "first");
		var secondResult = cachedDataLib.get("second", "second");
		assertThat(firstResult).isEqualTo("first/first");
		assertThat(secondResult).isEqualTo("second/second");
	}

}
