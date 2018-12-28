package entity;

/**
 * Created by Administrator on 2017-11-4.
 */
public class SuggestionEntity {
    private long sid;
    private String sugTitle;
    private String sugContent;
    private String sugPic;
    private int sugType;

    @Override
    public String toString() {
        return "SuggestionEntity{" +
                "sid=" + sid +
                ", sugTitle='" + sugTitle + '\'' +
                ", sugContent='" + sugContent + '\'' +
                ", sugPic='" + sugPic + '\'' +
                ", sugType=" + sugType +
                '}';
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getSugTitle() {
        return sugTitle;
    }

    public void setSugTitle(String sugTitle) {
        this.sugTitle = sugTitle;
    }

    public String getSugContent() {
        return sugContent;
    }

    public void setSugContent(String sugContent) {
        this.sugContent = sugContent;
    }

    public String getSugPic() {
        return sugPic;
    }

    public void setSugPic(String sugPic) {
        this.sugPic = sugPic;
    }

    public int getSugType() {
        return sugType;
    }

    public void setSugType(int sugType) {
        this.sugType = sugType;
    }
}
