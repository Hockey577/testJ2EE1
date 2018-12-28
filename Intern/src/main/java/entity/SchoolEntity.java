package entity;

/**
 * Created by Administrator on 2017-8-26.
 */
public class SchoolEntity {
    private long schId;
    private String schName;
    private String schDetail;

    public long getSchId() {
        return schId;
    }

    public void setSchId(long schId) {
        this.schId = schId;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public String getSchDetail() {
        return schDetail;
    }

    public void setSchDetail(String schDetail) {
        this.schDetail = schDetail;
    }

    @Override
    public String toString() {
        return "SchoolEntity{" +
                "schId=" + schId +
                ", schName='" + schName + '\'' +
                ", schDetail='" + schDetail + '\'' +
                '}';
    }
}
