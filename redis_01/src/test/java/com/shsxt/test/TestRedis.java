package com.shsxt.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import redis.clients.jedis.Jedis;

public class TestRedis {



	@Test
	public void test() {
		Jedis jedis=new Jedis("192.168.3.188", 6379);
		jedis.auth("123456");
		
		String result= jedis.set("jedis_redis", "hello jedis");
		
		System.out.println(result);
		
		System.out.println("result:"+jedis.get("jedis_redis"));;
	}

}
