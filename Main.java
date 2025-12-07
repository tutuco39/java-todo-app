import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    TaskManager manager = new TaskManager();
    Scanner scanner = new Scanner(System.in);

    System.out.println("===== Todo アプリ =====");

    while (true) {
      System.out.println("\nコマンドを入力してください");
      System.out.println("1: 追加, 2: 一覧, 3: 完了切替, 4: 削除, 0: 終了");
      System.out.println("> ");

      String input = scanner.nextLine();

      switch(input) {
        case "1":
          System.out.println("タスク名: ");
          String title = scanner.nextLine();
          manager.addTask(new Task(title));
          System.out.println("追加しました！");
          break;

        case "2":
          manager.showTasks();
          break;

        case "3":
          System.out.println("切り替える番号: ");
          int toggleIndex = Integer.parseInt(scanner.nextLine());
          manager.toggleDone(toggleIndex);
          break;

        case "4":
          System.out.println("削除する番号: ");
          int deleteIndex = Integer.parseInt(scanner.nextLine());
          manager.removeTask(deleteIndex);
          break;

        case "0":
          System.out.println("終了します");
          scanner.close();
          return;

        default:
          System.out.println("不正なコマンドです");
      }
    }
  }
}