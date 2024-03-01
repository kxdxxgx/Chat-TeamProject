package crossKim.chattingApp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/file/**") // 모든 요청에 대해
				.allowedOrigins("http://localhost:3000") // 이 도메인에서의 요청을 허용
				.allowedMethods("*"); // 모든 HTTP 메소드를 허용
	}

}
