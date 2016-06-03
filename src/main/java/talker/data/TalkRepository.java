package talker.data;

import talker.Talk;

import java.util.List;

/**
 * Created by Kamil on 2016-06-03.
 */
public interface TalkRepository {
    List<Talk> findTalks(long max, int count);
}
