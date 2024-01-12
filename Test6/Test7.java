package Test6;

class Test7 {
    public static void main(String[] args){
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                if (i==1 && j==1)
                    System.out.println("1の段");
                else if (i==2 && j==1)
                    System.out.println("2の段");
                else if (i==3 && j==1)
                    System.out.println("3の段");
                else if (i==4 && j==1)
                    System.out.println("4の段");
                else if (i==5 && j==1)
                    System.out.println("5の段");
                else if (i==6 && j==1)
                    System.out.println("6の段");
                else if (i==7 && j==1)
                    System.out.println("7の段");
                else if (i==8 && j==1)
                    System.out.println("8の段");
                else if (i==9 && j==1)
                    System.out.println("9の段");
                System.out.println(i +"×"+j+"="+i*j);
            }
        }
    }
}
