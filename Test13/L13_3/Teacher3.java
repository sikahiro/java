package Test13.L13_3;

// Teacher3クラスにインターフェースPerson3を実装
public class Teacher3 implements Person3 {
    private String name;
    private String job;
    private String subject;
    // コンストラクタ
    public Teacher3(String name,String job,String subject){
        this.name=name;
        this.job=job;
        this.subject=subject;
    }
    // 情報を表示するメソッドをオーバーライド
    @Override public void introduce(){
        System.out.println("氏名:"+this.name);
        System.out.println("職種:"+this.job);
        System.out.println("担当科目:"+this.subject);
    }
}
