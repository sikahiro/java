public class CDPlayer implements Player {
    @Override public void play(){
        System.out.println("**CD再生開始！");
    }
    @Override public void stop(){
        System.out.println("**CD再生終了！");
    }
    public void printInfo(){
        System.out.println("**ヘッドをクリーニングしました。");
    }
}
