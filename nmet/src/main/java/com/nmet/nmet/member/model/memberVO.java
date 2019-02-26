package com.nmet.nmet.member.model;

public class memberVO {
	private String ID;
	private String PASS;
	private String NAME;
	private String INSDATE;
	private String USEYN;
	public memberVO() {
		super();
	}
	public memberVO(String iD, String pASS, String nAME, String iNSDATE, String uSEYN) {
		super();
		ID = iD;
		PASS = pASS;
		NAME = nAME;
		INSDATE = iNSDATE;
		USEYN = uSEYN;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPASS() {
		return PASS;
	}
	public void setPASS(String pASS) {
		PASS = pASS;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getINSDATE() {
		return INSDATE;
	}
	public void setINSDATE(String iNSDATE) {
		INSDATE = iNSDATE;
	}
	public String getUSEYN() {
		return USEYN;
	}
	public void setUSEYN(String uSEYN) {
		USEYN = uSEYN;
	}
	@Override
	public String toString() {
		return "memberVO [ID=" + ID + ", PASS=" + PASS + ", NAME=" + NAME + ", INSDATE=" + INSDATE + ", USEYN=" + USEYN
				+ "]";
	}
	
}
