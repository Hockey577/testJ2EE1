package entity;

/**
 * Created by Administrator on 2017-9-27.
 */
public class TeacherEntity {
    private long tid;
    private String tname;
    private String tphone;
    private String tpassword;
    private long tcode;
    private String tschool;
    private String thead;
    private String tgender;
    private String tmail;

    @Override
    public String toString() {
        return "TeacherEntity{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tphone='" + tphone + '\'' +
                ", tpassword='" + tpassword + '\'' +
                ", tcode=" + tcode +
                ", tschool='" + tschool + '\'' +
                ", thead='" + thead + '\'' +
                ", tgender='" + tgender + '\'' +
                ", tmail='" + tmail + '\'' +
                '}';
    }

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone;
    }

    public String getTpassword() {
        return tpassword;
    }

    public void setTpassword(String tpassword) {
        this.tpassword = tpassword;
    }

    public long getTcode() {
        return tcode;
    }

    public void setTcode(long tcode) {
        this.tcode = tcode;
    }

    public String getTschool() {
        return tschool;
    }

    public void setTschool(String tschool) {
        this.tschool = tschool;
    }

    public String getThead() {
        return thead;
    }

    public void setThead(String thead) {
        this.thead = thead;
    }

    public String getTgender() {
        return tgender;
    }

    public void setTgender(String tgender) {
        this.tgender = tgender;
    }

    public String getTmail() {
        return tmail;
    }

    public void setTmail(String tmail) {
        this.tmail = tmail;
    }
}
