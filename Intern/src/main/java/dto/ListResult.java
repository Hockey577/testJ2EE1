package dto;

import java.util.List;

/**
 * Created by Administrator on 2017-8-6.
 */
public class ListResult<T> {
    private boolean success;
    private String state;// 200 404 406 500
    private List<T> data;
    private String error;

    public ListResult(boolean success, List<T> data, String state) {
        this.success = success;
        this.data = data;
        this.state = state;
    }

    public ListResult(boolean success, String error, String state) {
        this.success = success;
        this.error = error;
        this.state = state;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<T> getData() {
        return data;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "ListResult{" +
                "success=" + success +
                ", state='" + state + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
