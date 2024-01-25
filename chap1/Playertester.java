public class Playertester {
    public static void main(String[] args){
        Player[] a=new Player[2];
        a[0]=new VideoPlayer();
        a[1]=new CDPlayer();

        for (Player P :a){
            P.play();
            P.stop();
            System.out.println();
        }
    }
}
