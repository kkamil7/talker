package talker.web;

import org.junit.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

/**
 * Created by Kamil on 2016-06-03.
 */
public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController homeController = new HomeController();
        MockMvc mockMvc = standaloneSetup(homeController).build();
//        mockMvc.perform(get("/talker")).andExpect(view().name("home"));
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = get("/talker");
        ResultMatcher home = view().name("home");

        mockMvc.perform(mockHttpServletRequestBuilder).andExpect(home); //EXCEPTION
    }
}
