public class BinGO {
    static public void Bingo() {
        for (int i = 1; i <= 100 ; i++) {
            if ( i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " Bingo!");
            } else if(i % 3 == 0){
                System.out.println(i +" Bin");
            } else if (i % 5 == 0) {
                System.out.println(i + " Go");
            }
        }
    }
}
