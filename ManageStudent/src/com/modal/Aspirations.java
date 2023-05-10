package com.modal;

public class Aspirations {

	public Aspirations() {
		super();
	}

	public Aspirations(String maNganh, String tenNganh, String maTruong, String khoiXT, float diemThi) {
		super();
		this.maNganh = maNganh;
		this.tenNganh = tenNganh;
		this.maTruong = maTruong;
		this.khoiXT = khoiXT;
		this.diemThi = diemThi;
	}

	private String maNganh;
	private String tenNganh;
	private String maTruong;
	private String khoiXT;
	private float diemThi;

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}

	public String getTenNganh() {
		return tenNganh;
	}

	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}

	public String getMaTruong() {
		return maTruong;
	}

	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}

	public String getKhoiXT() {
		return khoiXT;
	}

	public void setKhoiXT(String khoiXT) {
		this.khoiXT = khoiXT;
	}

	public float getDiemThi() {
		return diemThi;
	}

	public void setDiemThi(float diemThi) {
		this.diemThi = diemThi;
	}
}
