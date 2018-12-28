package entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by Administrator on 2017-9-24.
 */
public class VacationEntity {
    private long sid;
    private String vtype;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date vdate;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date vstart;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date vend;
    private String vreason;
    private String vstate;

    @Override
    public String toString() {
        return "VacationEntity{" +
                "sid=" + sid +
                ", vtype='" + vtype + '\'' +
                ", vdate=" + vdate +
                ", vstart=" + vstart +
                ", vend=" + vend +
                ", vreason=" + vreason +
                '}';
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype;
    }

    public Date getVdate() {
        return vdate;
    }

    public void setVdate(Date vdate) {
        this.vdate = vdate;
    }

    public Date getVstart() {
        return vstart;
    }

    public void setVstart(Date vstart) {
        this.vstart = vstart;
    }

    public Date getVend() {
        return vend;
    }

    public void setVend(Date vend) {
        this.vend = vend;
    }

    public String getVreason() {
        return vreason;
    }

    public void setVreason(String vreason) {
        this.vreason = vreason;
    }

    public String getVstate() {
        return vstate;
    }

    public void setVstate(String vstate) {
        this.vstate = vstate;
    }
}
