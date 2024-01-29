package Test11.L11_7;

class Student2{
    public static void main(String[] args){
        Student A =new Student("Aさん", "001番", 89.0, 65.0, 88.0);
        Student B =new Student("Bさん", "002番", 80.0, 95.0 ,64.0);
        Student C =new Student("Cさん", "003番", 70.0, 80.0, 98.0);

        System.out.println(A.getNo()+A.getName()+"平均点"+A.getAve());
        System.out.println(B.getNo()+B.getName()+"平均点"+B.getAve());
        System.out.println(C.getNo()+C.getName()+"平均点"+C.getAve());
    }
}
