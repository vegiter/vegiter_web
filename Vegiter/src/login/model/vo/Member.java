package login.model.vo;

import java.sql.Date;

public class Member {
	private String memId;
	private String memPwd;
	private int memCode;
	private String memName;
	private char memGender;
	private String memPhone;
	private String memEmail;
	private String memStyle;
	private String memStatus;
	private Date memDeldate;
	
	public Member() {}

	public Member(String memId, String memPwd, int memCode, String memName, char memGender, String memPhone,
			String memEmail, String memStyle, String memStatus, Date memDeldate) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memCode = memCode;
		this.memName = memName;
		this.memGender = memGender;
		this.memPhone = memPhone;
		this.memEmail = memEmail;
		this.memStyle = memStyle;
		this.memStatus = memStatus;
		this.memDeldate = memDeldate;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPwd() {
		return memPwd;
	}

	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}

	public int getMemCode() {
		return memCode;
	}

	public void setMemCode(int memCode) {
		this.memCode = memCode;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public char getMemGender() {
		return memGender;
	}

	public void setMemGender(char memGender) {
		this.memGender = memGender;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public String getMemEmail() {
		return memEmail;
	}

	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	public String getMemStyle() {
		return memStyle;
	}

	public void setMemStyle(String memStyle) {
		this.memStyle = memStyle;
	}

	public String getMemStatus() {
		return memStatus;
	}

	public void memStatus(String memStatus) {
		this.memStatus = memStatus;
	}

	public Date getMemDeldate() {
		return memDeldate;
	}

	public void setMemDeldate(Date memDeldate) {
		this.memDeldate = memDeldate;
	}

	@Override
	public String toString() {
		return "Member [memId=" + memId + ", memPwd=" + memPwd + ", memCode=" + memCode + ", memName=" + memName
				+ ", memGender=" + memGender + ", memPhone=" + memPhone + ", memEmail=" + memEmail + ", memStyle="
				+ memStyle + ", memStatus=" + memStatus + ", memDeldate=" + memDeldate + "]";
	}
}
