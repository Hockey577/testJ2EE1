package entity;

/**
 * Created by Administrator on 2017-11-1.
 */
public class RecEntity {
    private long sid;
    private String recTitle;
    private String recLink;
    private String recPic;
    private int recType;

    @Override
    public String toString() {
        return "RecEntity{" +
                "sid=" + sid +
                ", recTitle='" + recTitle + '\'' +
                ", recLink='" + recLink + '\'' +
                ", recPic='" + recPic + '\'' +
                ", recType=" + recType +
                '}';
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getRecTitle() {
        return recTitle;
    }

    public void setRecTitle(String recTitle) {
        this.recTitle = recTitle;
    }

    public String getRecLink() {
        return recLink;
    }

    public void setRecLink(String recLink) {
        this.recLink = recLink;
    }

    public String getRecPic() {
        return recPic;
    }

    public void setRecPic(String recPic) {
        this.recPic = recPic;
    }

    public int getRecType() {
        return recType;
    }

    public void setRecType(int recType) {
        this.recType = recType;
    }
}
