package entity;

import java.util.Date;

/**
 * Created by Administrator on 2017-9-25.
 */
public class FeedbackEntity {
    private long sid;
    private Date sdate;
    private String scontent;
    private long sperson;
    private int sremark;//
    private String cname;
    private String sname;


    @Override
    public String toString() {
        return "FeedbackEntity{" +
                "sid=" + sid +
                ", sdate=" + sdate +
                ", scontent='" + scontent + '\'' +
                ", sperson=" + sperson +
                ", sremark=" + sremark +
                ", cname='" + cname + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }


    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public String getScontent() {
        return scontent;
    }

    public void setScontent(String scontent) {
        this.scontent = scontent;
    }

    public long getSperson() {
        return sperson;
    }

    public void setSperson(long sperson) {
        this.sperson = sperson;
    }

    public int getSremark() {
        return sremark;
    }

    public void setSremark(int sremark) {
        this.sremark = sremark;
    }
}
