package com.nmet.nmet.member.model;

public class itemVO {
	 private String ITEMCD;
	 private String ITEMNAME;
	 private String MADENMCD;
	 private String MADENAME;
	 private String ITEMUNITCD;
	 private String ITEMUNITNAME;
	 private String STOCKAMT;
	 private String STOCKYN;
	 private String USEYN;
	 private String ITEMCLSCD;
	 private String INSITEMLISTCD;	 
	 private String INSAMT;
	 
	 
	public String getINSAMT() {
		return INSAMT;
	}
	public void setINSAMT(String iNSAMT) {
		INSAMT = iNSAMT;
	}
	public String getINSITEMLISTCD() {
		return INSITEMLISTCD;
	}
	public void setINSITEMLISTCD(String iNSITEMLISTCD) {
		INSITEMLISTCD = iNSITEMLISTCD;
	}
	public String getITEMCLSCD() {
		return ITEMCLSCD;
	}
	public void setITEMCLSCD(String iTEMCLSCD) {
		ITEMCLSCD = iTEMCLSCD;
	}
	public itemVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public itemVO(String iTEMCD, String iTEMNAME, String mADENMCD, String mADENAME, String iTEMUNITCD, String sTOCKAMT,
			String sTOCKYN, String uSEYN, String iTEMUNITNAME) {
		super();
		ITEMCD = iTEMCD;
		ITEMNAME = iTEMNAME;
		MADENMCD = mADENMCD;
		MADENAME = mADENAME;
		ITEMUNITCD = iTEMUNITCD;
		STOCKAMT = sTOCKAMT;
		STOCKYN = sTOCKYN;
		USEYN = uSEYN;
		ITEMUNITNAME = iTEMUNITNAME;
	}
	public String getITEMCD() {
		return ITEMCD;
	}
	public void setITEMCD(String iTEMCD) {
		ITEMCD = iTEMCD;
	}
	public String getITEMNAME() {
		return ITEMNAME;
	}
	public void setITEMNAME(String iTEMNAME) {
		ITEMNAME = iTEMNAME;
	}
	public String getMADENMCD() {
		return MADENMCD;
	}
	public void setMADENMCD(String mADENMCD) {
		MADENMCD = mADENMCD;
	}
	public String getMADENAME() {
		return MADENAME;
	}
	public void setMADENAME(String mADENAME) {
		MADENAME = mADENAME;
	}
	public String getITEMUNITCD() {
		return ITEMUNITCD;
	}
	public void setITEMUNITCD(String iTEMUNITCD) {
		ITEMUNITCD = iTEMUNITCD;
	}
	public String getSTOCKAMT() {
		return STOCKAMT;
	}
	public void setSTOCKAMT(String sTOCKAMT) {
		STOCKAMT = sTOCKAMT;
	}
	public String getSTOCKYN() {
		return STOCKYN;
	}
	public void setSTOCKYN(String sTOCKYN) {
		STOCKYN = sTOCKYN;
	}
	public String getUSEYN() {
		return USEYN;
	}
	public void setUSEYN(String uSEYN) {
		USEYN = uSEYN;
	}
	public String getITEMUNITNAME() {
		return ITEMUNITNAME;
	}
	public void setITEMUNITNAME(String iTEMUNITNAME) {
		ITEMUNITNAME = iTEMUNITNAME;
	}
	@Override
	public String toString() {
		return "itemVO [ITEMCD=" + ITEMCD + ", ITEMNAME=" + ITEMNAME + ", MADENMCD=" + MADENMCD + ", MADENAME="
				+ MADENAME + ", ITEMUNITCD=" + ITEMUNITCD + ", ITEMUNITNAME=" + ITEMUNITNAME + ", STOCKAMT=" + STOCKAMT
				+ ", STOCKYN=" + STOCKYN + ", USEYN=" + USEYN + ", ITEMCLSCD=" + ITEMCLSCD + ", INSITEMLISTCD="
				+ INSITEMLISTCD + ", INSAMT=" + INSAMT + "]";
	}	 
}
