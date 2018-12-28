package entity;

import java.util.Date;

/**
 * Created by Administrator on 2017-8-24.
 */
public class JobEntity {
    private long jobId;
    private String jobName;
    private long cid;
    private int jobPlan;
    private String jobDetail;
    private Date jobRelease;
    private String jobSalary;

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public int getJobPlan() {
        return jobPlan;
    }

    public void setJobPlan(int jobPlan) {
        this.jobPlan = jobPlan;
    }

    public String getJobDetail() {
        return jobDetail;
    }

    public void setJobDetail(String jobDetail) {
        this.jobDetail = jobDetail;
    }

    public Date getJobRelease() {
        return jobRelease;
    }

    public void setJobRelease(Date jobRelease) {
        this.jobRelease = jobRelease;
    }

    public String getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(String jobSalary) {
        this.jobSalary = jobSalary;
    }

    @Override
    public String toString() {
        return "JobService{" +
                "jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                ", cid=" + cid +
                ", jobPlan=" + jobPlan +
                ", jobDetail='" + jobDetail + '\'' +
                ", jobRelease=" + jobRelease +
                ", jobSalary='" + jobSalary + '\'' +
                '}';
    }
}
