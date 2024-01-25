package Test13;

public class Cook3 implements Person3 {
    private String name;
    private String job;
    private String specialties;

    public Cook3(String name,String job,String specialties){
        this.name=name;
        this.job=job;
        this.specialties=specialties;
    }
    @Override public void nameP(){
        System.out.println("氏名:"+this.name);
    }
    @Override public void jobP(){
        System.out.println("職種:"+this.job);
    }
    @Override public void showFa(){
        System.out.println("得意料理:"+this.specialties);
    }
}
