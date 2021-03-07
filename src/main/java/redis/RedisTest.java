package redis;

import redis.clients.jedis.Jedis;

public class RedisTest {
    public void testFirstExample(){
        //链接redis
        Jedis jedis = new Jedis("192.168.56.101", 6379);

        //string类型
        jedis.set("name","demo");
        String name = jedis.get("name");

        jedis.close();
    }

}
