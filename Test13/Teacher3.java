package Test13;

public class Teacher3 implements Person3 {
    private String name;
    private String job;
    private String subject;
    
    public Teacher3(String name,String job,String subject){
        this.name=name;
        this.job=job;
        this.subject=subject;
    }
    
    @Override public void nameP(){
        System.out.println("氏名:"+this.name);
    }
    @Override public void jobP(){
        System.out.println("職種:"+this.job);
    }
    @Override public void showFa(){
        System.out.println("担当科目:"+this.subject);
    }
}
