/*
 * package comm.example.springdemo.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.ComponentScan; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.transaction.annotation.EnableTransactionManagement;
 * import org.springframework.web.servlet.config.annotation.EnableWebMvc; import
 * org.springframework.web.servlet.config.annotation.WebMvcConfigurer; import
 * org.springframework.web.servlet.view.InternalResourceViewResolver;
 * 
 * import com.mchange.v2.c3p0.ComboPooledDataSource;
 * 
 * @Configuration
 * 
 * @EnableWebMvc
 * 
 * @ComponentScan(basePackages = "comm.example.springdemo")
 * 
 * @EnableTransactionManagement public class DemoMvcConfig implements
 * WebMvcConfigurer{
 * 
 * 
 * @Bean public InternalResourceViewResolver jspView() {
 * InternalResourceViewResolver view=new InternalResourceViewResolver();
 * view.setPrefix("/WEB-INF/view"); view.setSuffix("*.jsp"); return view; }
 * 
 * public ComboPooledDataSource dataSource() { ComboPooledDataSource ds=new
 * ComboPooledDataSource(); ds.setJdbcUrl(""); } }
 */