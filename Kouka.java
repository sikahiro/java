import java.util.Scanner;

public class Kouka {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in,"shift-jis");
        StringBuilder s1 =new StringBuilder();
        // パスワードを入力
        System.out.print("現在のパスワードを入力してください:");
        // 入力されたパスワードをpassに入れる
        String pass =sc.nextLine();
        // StringBuilderにpassを追加
        s1.append(pass);
        // StringBuilderの文字列の並びを反転する
        s1.reverse();
        // セキュリティを強化したパスワードを表示する
        System.out.println("セキュリティ上の問題を発見しました。\nセキュリティを強化したパスワードを作成しました。");
        System.out.println("こちらをお使いください\n新しいパスワードは'"+s1+"'です。");
    }
}
