package bean;

import java.util.Date;

public class MemberDetailInfoBean {

	//Account 表
    private String phone;
    private Boolean isEnabled;
    
    //Member表
    private Integer memberSerial;//根据id来标定列表中的每一个对象
    private String memberQq;
    private String memberMail;
    private String memberAddress;

    //MemberType表
    private String typeName;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Integer getMemberSerial() {
		return memberSerial;
	}

	public void setMemberSerial(Integer memberSerial) {
		this.memberSerial = memberSerial;
	}

	public String getMemberQq() {
		return memberQq;
	}

	public void setMemberQq(String memberQq) {
		this.memberQq = memberQq;
	}

	public String getMemberMail() {
		return memberMail;
	}

	public void setMemberMail(String memberMail) {
		this.memberMail = memberMail;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
