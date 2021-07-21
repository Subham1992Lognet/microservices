package com.iiht.project.subham.ms1.iiht_ms1.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;




@Configuration
public class WebSecurityExtension extends WebSecurityConfigurerAdapter  {
	
	@Override
    public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/actuator/*").permitAll().anyRequest().authenticated().and().csrf().disable();
		http.oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);

    }


}



    