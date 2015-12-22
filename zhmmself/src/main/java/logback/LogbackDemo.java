package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月18日 下午12:53:42 类说明 :
 */
public class LogbackDemo {

    private static Logger log = LoggerFactory.getLogger(LogbackDemo.class);

    public static void main(String[] args) {
        log.trace("======trace");
        log.debug("======debug");
        log.info("======info");
        log.warn("======warn");
        log.error("======error");
    }

}
