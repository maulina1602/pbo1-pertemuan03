package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;    //i tadinya 0 ditambahkan 1 sehingga i=1
        System.out.println(i);  //betulkan i nilainya 1
        i++;    //krna tadi i bernilai 1 lalu ditambahkan 1 sehingga i=2
        System.out.println(i);  //i nilainya 2
        i=i+1;    //i++ sama deengan i+1 sehingga i=3
        System.out.println(i);  //i nilainya 3

        //berlaku juga untuk penambahan angka lain dan operator aritmatika lain
        i+=3; //sama dengan i=+3 sehingga i=6
        System.out.println(i);
        i+=3;   //6+3=9
        System.out.println(i);
        i*=3;   //sama dengan i =*3 sama dengan 9*3 sehingga i=27
        System.out.println(i);
        i*=3;   //27*3=81
        System.out.println(i);
    }
}
