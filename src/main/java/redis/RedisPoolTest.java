package redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisPoolTest {

    public void testPoolExample(){

        //配置连接池
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(20);
        config.setMaxIdle(10);
        config.setMinIdle(5);

        //创建连接池
        JedisPool jedisPool = new JedisPool(config, "192.168.56.101", 6379);
        Jedis jedis = jedisPool.getResource();

        //使用jedis操作
        jedis.set("name2","demo2");

        //手动关闭链接归还给连接池
        jedis.close();

    }

}
