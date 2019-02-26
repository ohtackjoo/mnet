package com.nmet.nmet.model;



public class empVO {
	private String ename;
	private int comm;
	private String hiredate;
	private int empno;
	private int mgr;
	private String job;
	private int deptno;
	private int sal;

	public empVO(String ename, int comm, String hiredate, int empno, int mgr, String job, int deptno, int sal) {
		super();
		this.ename = ename;
		this.comm = comm;
		this.hiredate = hiredate;
		this.empno = empno;
		this.mgr = mgr;
		this.job = job;
		this.deptno = deptno;
		this.sal = sal;
	}
	
	public empVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "empVO [ename=" + ename + ", comm=" + comm + ", hiredate=" + hiredate + ", empno=" + empno + ", mgr="
				+ mgr + ", job=" + job + ", deptno=" + deptno + ", sal=" + sal + "]";
	}
	
}
