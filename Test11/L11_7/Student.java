package Test11.L11_7;

public class Student {
    String name;
    String no;
    Double kok;
    Double suu;
    Double ei;

    Student(String n,String num,Double ko,Double su,Double e){
        name=n;
        no=num;
        kok=ko;
        suu=su;
        ei=e;
    }
    String getName(){
        return name;
    }
    String getNo(){
        return no;
    }
    Double getkok(){
        return kok;
    }
    Double getsuu(){
        return suu;
    }
    Double getei(){
        return ei;
    }

    Double getAve(){
        Double ave=0.0;
        ave=(getsuu()+getkok()+getei())/3;
        return ave;
    }

}
