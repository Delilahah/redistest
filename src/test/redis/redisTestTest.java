package redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import redis.clients.jedis.Jedis;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class redisTestTest {

    @Test
    public void testFirstExample() {
        //链接redis
        Jedis jedis = new Jedis("192.168.56.101", 6379);

        jedis.set("name","demo");
        String name = jedis.get("name");
        System.out.println(name);
        jedis.close();
    }
}
