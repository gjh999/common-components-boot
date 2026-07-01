package egovframework.com.config;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class EgovConfigAppRssWhitelist {
	@Bean(name = "egovRSSWhitelist")
	public List<String> egovRSSWhitelist() {
		return Arrays.asList("TB_RSS", "TB_BBS", "TB_ZIP");
	}
}
