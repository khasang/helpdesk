package io.khasang.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean(name="passwordEncoder")
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Autowired

    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
//        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
//        auth.inMemoryAuthentication().withUser("superadmin").password("superadmin").roles("SUPERADMIN");

        auth
                .jdbcAuthentication().dataSource(dataSource)
//                .withDefaultSchema()
//                .withUser("user").password("user").roles("USER").and()
//                .withUser("admin").password("admin").roles("ADMIN").and()
//                .withUser("superadmin").password("superadmin").roles("SUPERADMIN");
//                .passwordEncoder(passwordEncoder())
                .usersByUsernameQuery("select login, password, true from users where login=?")
//                .authoritiesByUsernameQuery("select login, password from users inner join role on users.role_id = role.id where login=?");
//                .authoritiesByUsernameQuery("select id, name_role from role where id=?");
                .authoritiesByUsernameQuery("select login, role from users where login=?");
    }



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
//                .antMatchers("/**").access("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
//                .antMatchers("/confidential/**").access("hasRole('ROLE_SUPERADMIN')")
//                .antMatchers("/admin/**").access("hasRole('ROLE_SUPERADMIN')")
//                .antMatchers("/**").access("hasRole('ROLE_SUPERADMIN')")
//                .antMatchers("/hello/**").access("hasRole('ROLE_USER')")
                .and().formLogin().defaultSuccessUrl("/", false)
                .usernameParameter("login").passwordParameter("password")
                .and().logout().logoutSuccessUrl("/?logout");
//                .disable().csrf();
    }
}
