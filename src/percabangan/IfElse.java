package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 6000;
        double uangDiDompet = 6000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, #DirumahAja");
        }else if(uangDiDompet>totalBelanja){
            double angsul = uangDiDompet - totalBelanja;
            System.out.println("Uang lebihan, angsulannya : " + angsul);
        }else{
            System.out.println("Uang pas kada beangsulan :'(");
        }
    }
}
