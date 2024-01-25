package Test13.L13_3;

// Cook3クラスにインターフェースPersonを実装
public class Cook3 implements Person3 {
    private String name;
    private String job;
    private String specialties;
    // コンストラクタ
    public Cook3(String name,String job,String specialties){
        this.name=name;
        this.job=job;
        this.specialties=specialties;
    }
    // 情報を表示するメソッドをオーバーライド
    @Override public void introduce(){
        System.out.println("氏名:"+this.name);
        System.out.println("職種:"+this.job);
        System.out.println("得意料理:"+this.specialties);
    }
}
