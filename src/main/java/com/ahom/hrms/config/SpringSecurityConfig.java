package com.ahom.hrms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.ahom.hrms.filter.JwtFilter;
import com.ahom.hrms.util.JwtUtil;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private CustomUserService customUserService;

	@Autowired
	private JwtFilter jwtFilter;
	
//	@Autowired
//	private JwtUtil jwtUtil;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUserService);
		//auth.userDetailsService(userDetailsService());
		
	}

	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
		.csrf()
		.disable()
		.authorizeHttpRequests()
		.antMatchers( "/usermaster/**", "/saveuser/**",
				"/authenticate/**",
				"/usermaster/**","/v2/api-docs",
				"/configuration/ui",
				"/swagger-resources/**",
				"/configuration/security",
				"/swagger-ui.html",
				"/webjars/**","/**").permitAll()
		.antMatchers()
		.hasAnyAuthority("ADMIN")//"ADMIN"
		
		
		
		//.antMatchers("/**")
//		.anyRequest()
//		//.hasAnyAuthority("ADMIN")
//		//.anyRequest()
//		.authenticated()
//		.and()
//		.formLogin()
//		.and()
//		.httpBasic()
//		.and()
//		.logout()
//		.permitAll()
		
		
		
		.anyRequest().authenticated()
        .and().httpBasic().and().logout().and().sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);;


//				http .csrf().disable();
//				http  .authorizeRequests()
//				.anyRequest()
//				.authenticated()
//				.and()
//				.httpBasic();
		
		
		//jwt token
//		http
//		.csrf()
//		.disable()
//		.authorizeHttpRequests()
//		.anyRequest()
//		.authenticated()
//		.and()
//		.exceptionHandling().authenticationEntryPoint(this.jwtFilter)
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	//	@Override
	//	@Bean
	//	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
	//		auth.userDetailsService(customUserService).passwordEncoder(passwordEncoder());

	//auth.inMemoryAuthentication().withUser("raja").password("12345").roles("ADMIN");
	//auth.inMemoryAuthentication().withUser("rohan").password(this.passwordEncoder().encode("123")).roles("ADMIN");
	//}

	@Bean
	//@Override
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider provider= new DaoAuthenticationProvider();
		provider.setUserDetailsService(this.customUserService);
		provider.setPasswordEncoder(passwordEncoder());
		return provider;
	}


}
