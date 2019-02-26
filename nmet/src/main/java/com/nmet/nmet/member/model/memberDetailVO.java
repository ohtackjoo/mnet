package com.nmet.nmet.member.model;

public class memberDetailVO {
	private String CDNO; 
	private int CDLVL;
	private String UPCD;
	private String CDNAME;
	private String INSUSER;
	private String INSDATE;
	private String USEYN;
	public memberDetailVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public memberDetailVO(String cDNO, int cDLVL, String uPCD, String cDNAME, String iNSUSER, String iNSDATE,
			String uSEYN) {
		super();
		CDNO = cDNO;
		CDLVL = cDLVL;
		UPCD = uPCD;
		CDNAME = cDNAME;
		INSUSER = iNSUSER;
		INSDATE = iNSDATE;
		USEYN = uSEYN;
	}
	public String getCDNO() {
		return CDNO;
	}
	public void setCDNO(String cDNO) {
		CDNO = cDNO;
	}
	public int getCDLVL() {
		return CDLVL;
	}
	public void setCDLVL(int cDLVL) {
		CDLVL = cDLVL;
	}
	public String getUPCD() {
		return UPCD;
	}
	public void setUPCD(String uPCD) {
		UPCD = uPCD;
	}
	public String getCDNAME() {
		return CDNAME;
	}
	public void setCDNAME(String cDNAME) {
		CDNAME = cDNAME;
	}
	public String getINSUSER() {
		return INSUSER;
	}
	public void setINSUSER(String iNSUSER) {
		INSUSER = iNSUSER;
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
		return "memberDetailVO [CDNO=" + CDNO + ", CDLVL=" + CDLVL + ", UPCD=" + UPCD + ", CDNAME=" + CDNAME
				+ ", INSUSER=" + INSUSER + ", INSDATE=" + INSDATE + ", USEYN=" + USEYN + "]";
	}
	
}
