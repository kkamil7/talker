package talker.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.ComponentScan.Filter;
/**
 * Created by Kamil on 2016-06-03.
 */
@Configuration
@ComponentScan(basePackages = {"talker"},
excludeFilters = {@Filter(type=FilterType.ANNOTATION, value= EnableWebMvc.class)})
public class RootConfig {
}
