package object.body;

public class CreateProjectAPIObjectBody {

    Integer userId;
    String regionId;
    String projectName;
    Integer qutaInGBytes;
    String startTime;
    String endTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getQutaInGBytes() {
        return qutaInGBytes;
    }

    public void setQutaInGBytes(Integer qutaInGBytes) {
        this.qutaInGBytes = qutaInGBytes;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CreateProjectAPIObjectBody(){
        super();
    }

    public CreateProjectAPIObjectBody(Integer userId, String regionId, String projectName, Integer qutaInGBytes, String startTime, String endTime) {
        this.userId = userId;
        this.regionId = regionId;
        this.projectName = projectName;
        this.qutaInGBytes = qutaInGBytes;
        this.startTime = startTime;
        this.endTime = endTime;
    }


    @Override
    public String toString(){
        return "BodyCreatingProjectAPIObject [userId" + userId + ", regionId="
                + regionId
                + ", projectName="
                + projectName
                + ", qutaInGBytes"
                + qutaInGBytes
                + ", startTime"
                + startTime
                + ", endTime"
                + endTime + "]";
    }
}
