package com.nmet.nmet.member.model;

public class codemngVO {
	private String CDNO;
	private int CDLVL;
	private String UPCD;
	private String CDNAME;
	private String USEYN;
	private String INSUSER;
	
	public String getINSUSER() {
		return INSUSER;
	}
	public void setINSUSER(String iNSUSER) {
		INSUSER = iNSUSER;
	}
	public codemngVO(String cDNO, int cDLVL, String uPCD, String cDNAME, String uSEYN) {
		super();
		CDNO = cDNO;
		CDLVL = cDLVL;
		UPCD = uPCD;
		CDNAME = cDNAME;
		USEYN = uSEYN;
	}
	public codemngVO() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getUSEYN() {
		return USEYN;
	}
	public void setUSEYN(String uSEYN) {
		USEYN = uSEYN;
	}
	@Override
	public String toString() {
		return "codemngVO [CDNO=" + CDNO + ", CDLVL=" + CDLVL + ", UPCD=" + UPCD + ", CDNAME=" + CDNAME + ", USEYN="
				+ USEYN + "]";
	}
	
}
