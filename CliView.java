import java.util.List;

public class CliView {

  //　メニュー表示
  public void showMenu() {
    System.out.println("1: 追加, 2: 一覧, 3: 完了切替, 4: 削除, 0: 終了");
    System.out.println("> ");
  }

  //　タスク一覧表示
  public void showTasks(List<Task> tasks) {
    // 空チェック
    if (tasks.isEmpty()) {
      System.out.println("タスクはありません");
      printBlantLine();
      return;
    }

    //　タスクの数だけ繰り返す
    for (int i = 0; i < tasks.size(); i++) {
      Task task = tasks.get(i);
      // String mark = task.isDone() ? "[x]" : "[ ]";
      System.out.println(i + ": " + tasks.get(i));
      printBlantLine();
    }
  }

  //　汎用メッセージの表示
  public void showMessage(String message) {
    System.out.println(message);
    printBlantLine();
  }

  //　改行
  private void printBlantLine() {
    System.out.println();
  }

}
