package entity;

/**
 * Created by Administrator on 2017-9-1.
 */
public class ExamEntity {
    private long sid;
    private int state;
    private String school;
    private String sub1;
    private int gra1;
    private String sub2;
    private int gra2;
    private String sub3;
    private int gra3;
    private String sub4;
    private int gra4;

    @Override
    public String toString() {
        return "ExamEntity{" +
                "sid=" + sid +
                ", state=" + state +
                ", school='" + school + '\'' +
                ", sub1='" + sub1 + '\'' +
                ", gra1=" + gra1 +
                ", sub2='" + sub2 + '\'' +
                ", gra2=" + gra2 +
                ", sub3='" + sub3 + '\'' +
                ", gra3=" + gra3 +
                ", sub4='" + sub4 + '\'' +
                ", gra4=" + gra4 +
                '}';
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSub1() {
        return sub1;
    }

    public void setSub1(String sub1) {
        this.sub1 = sub1;
    }

    public int getGra1() {
        return gra1;
    }

    public void setGra1(int gra1) {
        this.gra1 = gra1;
    }

    public String getSub2() {
        return sub2;
    }

    public void setSub2(String sub2) {
        this.sub2 = sub2;
    }

    public int getGra2() {
        return gra2;
    }

    public void setGra2(int gra2) {
        this.gra2 = gra2;
    }

    public String getSub3() {
        return sub3;
    }

    public void setSub3(String sub3) {
        this.sub3 = sub3;
    }

    public int getGra3() {
        return gra3;
    }

    public void setGra3(int gra3) {
        this.gra3 = gra3;
    }

    public String getSub4() {
        return sub4;
    }

    public void setSub4(String sub4) {
        this.sub4 = sub4;
    }

    public int getGra4() {
        return gra4;
    }

    public void setGra4(int gra4) {
        this.gra4 = gra4;
    }
}
