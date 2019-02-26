package com.nmet.nmet.member.model;

public class memberDVO {
	 private String ID;
	 private String USERINFODETAILCD;
	 private String RELCD; 
	 private int ADDRCD;
	 private String ADDRNAME;
	 private String MOBILETELNO;
	 private String HOMETELNO;
	 private String INSUSER;
	 private String INSDATE;
	 private String  USEYN;
	 private String DELIVNAME;
	public memberDVO(String iD, String uSERINFODETAILCD, String rELCD, int aDDRCD, String aDDRNAME, String mOBILETELNO,
			String hOMETELNO, String iNSUSER, String iNSDATE, String uSEYN, String dELIVNAME) {
		super();
		ID = iD;
		USERINFODETAILCD = uSERINFODETAILCD;
		RELCD = rELCD;
		ADDRCD = aDDRCD;
		ADDRNAME = aDDRNAME;
		MOBILETELNO = mOBILETELNO;
		HOMETELNO = hOMETELNO;
		INSUSER = iNSUSER;
		INSDATE = iNSDATE;
		USEYN = uSEYN;
		DELIVNAME = dELIVNAME;
	}
	public memberDVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getUSERINFODETAILCD() {
		return USERINFODETAILCD;
	}
	public void setUSERINFODETAILCD(String uSERINFODETAILCD) {
		USERINFODETAILCD = uSERINFODETAILCD;
	}
	public String getRELCD() {
		return RELCD;
	}
	public void setRELCD(String rELCD) {
		RELCD = rELCD;
	}
	public int getADDRCD() {
		return ADDRCD;
	}
	public void setADDRCD(int aDDRCD) {
		ADDRCD = aDDRCD;
	}
	public String getADDRNAME() {
		return ADDRNAME;
	}
	public void setADDRNAME(String aDDRNAME) {
		ADDRNAME = aDDRNAME;
	}
	public String getMOBILETELNO() {
		return MOBILETELNO;
	}
	public void setMOBILETELNO(String mOBILETELNO) {
		MOBILETELNO = mOBILETELNO;
	}
	public String getHOMETELNO() {
		return HOMETELNO;
	}
	public void setHOMETELNO(String hOMETELNO) {
		HOMETELNO = hOMETELNO;
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
	public String getDELIVNAME() {
		return DELIVNAME;
	}
	public void setDELIVNAME(String dELIVNAME) {
		DELIVNAME = dELIVNAME;
	}
	@Override
	public String toString() {
		return "memberDVO [ID=" + ID + ", USERINFODETAILCD=" + USERINFODETAILCD + ", RELCD=" + RELCD + ", ADDRCD="
				+ ADDRCD + ", ADDRNAME=" + ADDRNAME + ", MOBILETELNO=" + MOBILETELNO + ", HOMETELNO=" + HOMETELNO
				+ ", INSUSER=" + INSUSER + ", INSDATE=" + INSDATE + ", USEYN=" + USEYN + ", DELIVNAME=" + DELIVNAME
				+ "]";
	}
	 
}
