package dto;

/**
 * Created by Administrator on 2017-8-26.
 */
public class StringResult {
    private boolean success;
    private String state;
    private String error;
    private String data;

    public StringResult(boolean success, String state, String data) {
        this.success = success;
        this.state = state;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
