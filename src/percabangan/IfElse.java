package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDiDompet = 50000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, #DirumahAja");
        }else{
            System.out.println("Uang cukup, habis belanja langsung bulik");
        }
    }
}
