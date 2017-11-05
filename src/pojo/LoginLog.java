package pojo;

public class LoginLog {
    private Integer loginSerial;

    private String loginIp;

    private String loginTime;

    private String loginInfo;

    public Integer getLoginSerial() {
        return loginSerial;
    }

    public void setLoginSerial(Integer loginSerial) {
        this.loginSerial = loginSerial;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime == null ? null : loginTime.trim();
    }

    public String getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(String loginInfo) {
        this.loginInfo = loginInfo == null ? null : loginInfo.trim();
    }
}