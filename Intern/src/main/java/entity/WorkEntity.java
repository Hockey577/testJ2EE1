package entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Administrator on 2017-9-19.
 */
public class WorkEntity {
    private long sid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date stime;
    private String longitude;
    private String latitude;
    private String state;

    @Override
    public String toString() {
        return "WorkEntity{" +
                "sid=" + sid +
                ", stime=" + stime +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }



    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
