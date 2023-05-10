package com.modal;

public class Score {
    private float Toan;
    private float Van;
    private float Anh;
    private float Ly;
    private float Hoa;
    private float Sinh;
    private float diemUT;

    public Score() {
    }

    public Score(float toan, float van, float anh, float ly, float hoa, float sinh, float diemUT) {
        this.Toan = toan;
        this.Van = van;
        this.Anh = anh;
        this.Ly = ly;
        this.Hoa = hoa;
        this.Sinh = sinh;
        this.diemUT = diemUT;
    }

    public float getA() {
        return this.Toan + this.Ly + this.Hoa + this.diemUT;
    }

    public float getB() {
        return this.Toan + this.Ly + this.Anh + this.diemUT;
    }

    public float getC() {
        return this.Toan + this.Sinh + this.Hoa + this.diemUT;
    }

    public float getD() {
        return this.Toan + this.Sinh + this.Van + this.diemUT;
    }

    public float getE() {
        return this.Toan + this.Van + this.Ly + this.diemUT;
    }

    public float getF() {
        return this.Toan + this.Van + this.Hoa + this.diemUT;
    }

    public float getToan() {
        return Toan;
    }

    public void setToan(float toan) {
        Toan = toan;
    }

    public float getVan() {
        return Van;
    }

    public void setVan(float van) {
        Van = van;
    }

    public float getAnh() {
        return Anh;
    }

    public void setAnh(float anh) {
        Anh = anh;
    }

    public float getLy() {
        return Ly;
    }

    public void setLy(float ly) {
        Ly = ly;
    }

    public float getHoa() {
        return Hoa;
    }

    public void setHoa(float hoa) {
        Hoa = hoa;
    }

    public float getSinh() {
        return Sinh;
    }

    public void setSinh(float sinh) {
        Sinh = sinh;
    }

    public float getDiemUT() {
        return diemUT;
    }

    public void setDiemUT(float diemUT) {
        this.diemUT = diemUT;
    }
}
