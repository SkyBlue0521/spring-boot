package com.myboot.common.tiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class TilesConfig {
	
	@Bean
	public TilesConfigurer tilesConfigurer() {
		final TilesConfigurer configurer = new TilesConfigurer();
		configurer.setDefinitions(new String[] {"WEB-INF/tiles/tiles_member.xml","WEB-INF/tiles/tiles_board.xml"});
		//,"WEB-INF/tiles/tiles_board.xml"
		configurer.setCheckRefresh(true);
		return configurer;
	}
	
//	<beans:bean id="tilesConfigurer" class="org.springframework.web.servlet.view.tiles2.TilesConfigurer">
//	<beans:property name="definitions">
//	<beans:list>
//	<beans:value>classpath:tiles/*.xml</beans:value>
//	</beans:list>
//	</beans:property>
	
	@Bean
	public TilesViewResolver tilesViewResolver() {
		final TilesViewResolver resolver = new TilesViewResolver();
		resolver.setViewClass(TilesView.class);
		return resolver;
	}
	
//	<beans:bean id="viewResolver"
//			class="org.springframework.web.servlet.view.UrlBasedViewResolver">
//			<beans:property name="viewClass" value="org.springframework.web.servlet.view.tiles2.TilesView"/>
//			</beans:bean>

}
