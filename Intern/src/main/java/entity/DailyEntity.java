package entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by Administrator on 2017-9-21.
 */
public class DailyEntity {
    private long sid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date sdate;
    private String workDone;
    private String workUndo;
    private String workNeed;
    private String remark;

    @Override
    public String toString() {
        return "DailyEntity{" +
                "sid=" + sid +
                ", sdate=" + sdate +
                ", workDone='" + workDone + '\'' +
                ", workUndo='" + workUndo + '\'' +
                ", workNeed='" + workNeed + '\'' +
                ", remark='" + remark + '\'' +
                '}';
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

    public String getWorkDone() {
        return workDone;
    }

    public void setWorkDone(String workDone) {
        this.workDone = workDone;
    }

    public String getWorkUndo() {
        return workUndo;
    }

    public void setWorkUndo(String workUndo) {
        this.workUndo = workUndo;
    }

    public String getWorkNeed() {
        return workNeed;
    }

    public void setWorkNeed(String workNeed) {
        this.workNeed = workNeed;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
