package cn.g_open.xiaoxiaole;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("cn.g_open.game.db.mapper")
public class XiaoxiaoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiaoxiaoleApplication.class, args);
	}
}
