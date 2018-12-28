package entity;

import java.io.File;
import java.util.Date;

/**
 * Created by Administrator on 2017-8-24.
 */
public class StudentEntity {
    private long sid;
    private String sname;
    private String sphone;
    private String spassword;
    private long scode;
    private String sschool;
    private String shead;
    private String sgender;
    private String smajor;
    private Date sbirth;
    private String smail;
    private String sgo;
    private String stoken;

    @Override
    public String toString() {
        return "StudentEntity{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sphone='" + sphone + '\'' +
                ", spassword='" + spassword + '\'' +
                ", scode=" + scode +
                ", sschool='" + sschool + '\'' +
                ", shead='" + shead + '\'' +
                ", sgender='" + sgender + '\'' +
                ", smajor='" + smajor + '\'' +
                ", sbirth=" + sbirth +
                ", smail='" + smail + '\'' +
                ", sgo='" + sgo + '\'' +
                ", stoken='" + stoken + '\'' +
                '}';
    }

    public String getStoken() {
        return stoken;
    }

    public void setStoken(String stoken) {
        this.stoken = stoken;
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public long getScode() {
        return scode;
    }

    public void setScode(long scode) {
        this.scode = scode;
    }

    public String getSschool() {
        return sschool;
    }

    public void setSschool(String sschool) {
        this.sschool = sschool;
    }

    public String getShead() {
        return shead;
    }

    public void setShead(String shead) {
        this.shead = shead;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public String getSmajor() {
        return smajor;
    }

    public void setSmajor(String smajor) {
        this.smajor = smajor;
    }

    public Date getSbirth() {
        return sbirth;
    }

    public void setSbirth(Date sbirth) {
        this.sbirth = sbirth;
    }

    public String getSmail() {
        return smail;
    }

    public void setSmail(String smail) {
        this.smail = smail;
    }

    public String getSgo() {
        return sgo;
    }

    public void setSgo(String sgo) {
        this.sgo = sgo;
    }


}
