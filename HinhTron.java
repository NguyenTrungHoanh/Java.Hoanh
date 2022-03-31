
package OOP;

public class HinhTron {
   double bk;
   
   public HinhTron(double bk) {
        this.bk = bk;
    }
   
    public double getBk() {
        return bk;
    }
    
    public void setBk() {
        this.bk = bk;
    }
    
    public double tinhDienTich() {
        return bk* bk * 3.14;
    }
    
    public double tinhChuVi(){
        return bk * 2 * 3.14;
}
}
  
    
