package object.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class GetProjectListSubObject {

    String projectId;
    String projectName;
    Integer status;
    Integer period;
    Long startTime;
    String userId;
    String userName;
    String roleId;
    String roleName;
    Long totalQuota;
    Integer userIdMapping;
    String regionId;
    String regionName;


    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Long getTotalQuota() {
        return totalQuota;
    }

    public void setTotalQuota(Long totalQuota) {
        this.totalQuota = totalQuota;
    }

    public Integer getUserIdMapping() {
        return userIdMapping;
    }

    public void setUserIdMapping(Integer userIdMapping) {
        this.userIdMapping = userIdMapping;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public GetProjectListSubObject(){
        super();
    }

    public GetProjectListSubObject(String projectId, String projectName, Integer status, Integer period, Long startTime, String userId, String userName, String roleId, String roleName, Long totalQuota, Integer userIdMapping, String regionId, String regionName) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.status = status;
        this.period = period;
        this.startTime = startTime;
        this.userId = userId;
        this.userName = userName;
        this.roleId = roleId;
        this.roleName = roleName;
        this.totalQuota = totalQuota;
        this.userIdMapping = userIdMapping;
        this.regionId = regionId;
        this.regionName = regionName;
    }
}
