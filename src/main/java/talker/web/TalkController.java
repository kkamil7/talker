package talker.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import talker.Talk;
import talker.data.TalkRepository;

import java.util.List;

/**
 * Created by Kamil on 2016-06-03.
 */
@Controller
@RequestMapping("/talks")
public class TalkController {
    private TalkRepository talkRepository;

    @Autowired
    public TalkController(TalkRepository talkRepository) {
        this.talkRepository = talkRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String talks(Model model) {
        model.addAttribute("talkList", talkRepository.findTalks(Long.MAX_VALUE, 20));
        return "talks";
    }
}
