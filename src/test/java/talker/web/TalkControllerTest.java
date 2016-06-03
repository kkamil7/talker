package talker.web;

import org.junit.Test;
import talker.Talk;
import talker.data.TalkRepository;

import java.util.List;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

/**
 * Created by Kamil on 2016-06-03.
 */
public class TalkControllerTest {
    @Test
    public void shouldShowRecentTalks() throws Exception {
        List<Talk> expectedTalks = createTalkList(20);
        TalkRepository mockRepository = mock(TalkRepository.class);
        when(mockRepository.findTalks(Long.MAX_VALUE, 20)).thenReturn(expectedTalks);

        TalkController controller = new TalkController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).setSingleView(
                new InternalResourceView("/WEB-INF/views/talks.jsp")).build();
        mockMvc.perform(get("/talks"))
                .andExpect(view().name("talks"))
                .andExpect(model().attributeExists("talkList"))
                .andExpect(model().attribute("talkList", hasItems(expectedTalks.toArray())));
    }

    public List<Talk> createTalkList(int count) {
        List<Talk> talks = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            talks.add(new Talk("Talk " + i, new Date()));
        }
        return talks;
    }
}
