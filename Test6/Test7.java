package Test6;

class Test7 {
    public static void main(String[] args){
        //iが9以上になるまで動く
        for (int i = 1; i <= 9; i++){
            //jが9以上になるまで動く
            for (int j = 1; j <= 9; j++){
                //1×1の場合"1の段と表示"
                if (i==1 && j==1)
                    System.out.println("1の段");
                //2×1の場合"2の段と表示"
                else if (i==2 && j==1)
                    System.out.println("2の段");
                //3×1の場合"3の段と表示"
                else if (i==3 && j==1)
                    System.out.println("3の段");
                //4×1の場合"4の段と表示"
                else if (i==4 && j==1)
                    System.out.println("4の段");
                //5×1の場合"5の段と表示"
                else if (i==5 && j==1)
                    System.out.println("5の段");
                //6×1の場合"6の段と表示"
                else if (i==6 && j==1)
                    System.out.println("6の段");
                //7×1の場合"7の段と表示"
                else if (i==7 && j==1)
                    System.out.println("7の段");
                //8×1の場合"8の段と表示"
                else if (i==8 && j==1)
                    System.out.println("8の段");
                //9×1の場合"9の段と表示"
                else if (i==9 && j==1)
                    System.out.println("9の段");
                //計算式と計算結果を表示
                System.out.println(i +"×"+j+"="+i*j);
            }
        }
    }
}
