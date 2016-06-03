package talker.data;

import org.springframework.stereotype.Repository;
import talker.Talk;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Kamil on 2016-06-03.
 */
@Repository
public class TalkRepositoryImpl implements TalkRepository {
    private List<Talk> talkList = new ArrayList<>();

    @Override
    public List<Talk> findTalks(long max, int count) {
        Talk talk1 = new Talk("Pierwszy talk", new Date());
        Talk talk2 = new Talk("Drugi talk", new Date());
        Talk talk3 = new Talk("Trzeci talk", new Date());
        Talk talk4 = new Talk("Czwarty talk", new Date());
        Talk talk5 = new Talk("Piąty talk", new Date());
        Talk talk6 = new Talk("Szósty talk", new Date());
        talkList.add(talk1);
        talkList.add(talk2);
        talkList.add(talk3);
        talkList.add(talk4);
        talkList.add(talk5);
        talkList.add(talk6);
        return talkList;
    }
}