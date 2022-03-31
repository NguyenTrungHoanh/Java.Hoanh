package OOP;
public class HinhChuNhat {
    double chieudai,chieurong;
    
     public HinhChuNhat(double dai, double rong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;   
    }
     
    public double getRong() {
        return chieurong;
    }
    
    public double getDai() {
        return chieudai;
    }
    
    public void setRong(double rong) {
        this.chieurong = chieurong;
    }
    
    public void setDai(double dai) {
        this.chieudai = chieudai;
    }
    
    public double tinhDienTich() {
        return chieudai * chieurong;
    }
    
    public double tinhChuVi() {
        return (chieudai + chieurong) * 2;
    }
}

