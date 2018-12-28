package dto;

import entity.StudentEntity;

/**
 * Created by Administrator on 2017-8-24.
 */
public class ObjectResult {
    private boolean success;
    private String state;// 200 404 406 500
    private Object object;
    private String error;

    public ObjectResult(boolean success, String state, Object object) {
        this.success = success;
        this.state = state;
        this.object = object;
    }

    public ObjectResult(boolean success, String state, String error) {
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

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
