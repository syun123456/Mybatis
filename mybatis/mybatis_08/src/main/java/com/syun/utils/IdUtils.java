package com.syun.utils;

import java.util.UUID;

import org.junit.Test;

public class IdUtils {
	public static String getId() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	@Test
	public void test() {
		System.out.println(IdUtils.getId());
	}
}
