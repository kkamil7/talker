package talker;

import java.util.Date;

/**
 * Created by Kamil on 2016-06-03.
 */
public class Talk {
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitue; //szerokosc
    private Double longitude;

    public Talk(String message, Date time) {
        this(message, time, null, null);
    }

    public Talk(String message, Date time, Double latitue, Double longitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.latitue = latitue;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitue() {
        return latitue;
    }

    public Double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Talk talk = (Talk) o;

        if (getId() != null ? !getId().equals(talk.getId()) : talk.getId() != null) return false;
        if (!getMessage().equals(talk.getMessage())) return false;
        if (!getTime().equals(talk.getTime())) return false;
        if (!getLatitue().equals(talk.getLatitue())) return false;
        return getLongitude().equals(talk.getLongitude());

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + getMessage().hashCode();
        result = 31 * result + getTime().hashCode();
        result = 31 * result + getLatitue().hashCode();
        result = 31 * result + getLongitude().hashCode();
        return result;
    }
}
