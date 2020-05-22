import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.JedisPool;

import java.io.Serializable;

/**
 * @Auther: yanke
 * @Date: 2020/5/21 17:14
 * @Description:
 */
public class JedisUtils extends JedisPool implements Serializable {
    JedisUtils(GenericObjectPoolConfig poolConfig, String host, int port) {
        super(poolConfig, host, port);
    }
}
