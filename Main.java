import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    TaskManager manager = new TaskManager();
    Scanner scanner = new Scanner(System.in);
    CliView view = new CliView();

    // System.out.println("===== Todo アプリ =====");

    while (true) {
      view.showMenu();
      String input = scanner.nextLine();

      // System.out.println("\nコマンドを入力してください");

      switch(input) {
        case "1":
          view.showMessage("タスク名を入力してください");
          String title = scanner.nextLine();
          manager.addTask(title);
          view.showMessage("追加しました！");
          break;

        case "2":
          view.showTasks(manager.getTasks());
          break;

        case "3":
          view.showMessage("切り替える番号: ");
          int toggleIndex = Integer.parseInt(scanner.nextLine());
          manager.toggleDone(toggleIndex);
          view.showMessage("切り替えました。");
          break;

        case "4":
          view.showMessage("削除する番号: ");
          int deleteIndex = Integer.parseInt(scanner.nextLine());
          manager.removeTask(deleteIndex);
          view.showMessage("削除しました。");
          break;

        case "0":
          view.showMessage("終了します");
          scanner.close();
          return;

        default:
          view.showMessage("不正なコマンドです");
      }
    }
  }
}