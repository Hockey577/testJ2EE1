package entity;

import java.awt.*;

/**
 * Created by Administrator on 2017-8-24.
 */
public class CompanyEntity {
    private long cid;
    private String cname;
    private String carea;
    private String cman;
    private long ctel;
    private String cmail;
    private String ccode;
    private String cpassword;
    private String cdetail;
    private String caddress;


    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCarea() {
        return carea;
    }

    public void setCarea(String carea) {
        this.carea = carea;
    }

    public String getCman() {
        return cman;
    }

    public void setCman(String cman) {
        this.cman = cman;
    }

    public long getCtel() {
        return ctel;
    }

    public void setCtel(long ctel) {
        this.ctel = ctel;
    }

    public String getCmail() {
        return cmail;
    }

    public void setCmail(String cmail) {
        this.cmail = cmail;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public String getCdetail() {
        return cdetail;
    }

    public void setCdetail(String cdetail) {
        this.cdetail = cdetail;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    @Override
    public String toString() {
        return "CompanyEntity{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", carea='" + carea + '\'' +
                ", cman='" + cman + '\'' +
                ", ctel=" + ctel +
                ", cmail='" + cmail + '\'' +
                ", ccode='" + ccode + '\'' +
                ", cpassword='" + cpassword + '\'' +
                ", cdetail='" + cdetail + '\'' +
                ", caddress='" + caddress + '\'' +
                '}';
    }
}
