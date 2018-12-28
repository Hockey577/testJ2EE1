package dto;

/**
 * Created by Administrator on 2017-8-14.
 */
public class CommonResult {
    private boolean success;
    private String state;// 200 404 406 500
    private String error;

    public CommonResult(boolean success, String state) {
        this.success = success;
        this.state = state;
    }

    public CommonResult(boolean success, String state, String error) {
        this.success = success;
        this.state = state;
        this.error = error;
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

    @Override
    public String toString() {
        return "CommonResult{" +
                "success=" + success +
                ", state='" + state + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
