public class Task {
  private String title; //タスク名
  private boolean done; //完了フラグ

  //　コンストラクタ
  public Task(String title) {
    this.title = title;
    this.done = false;
  }

  //　タスク名を取得
  public String getTitle() {
    return title;
  }

  //　完了状態を取得
  public boolean isDone() {
    return done;
  }

  //完了状態を変更
  public void toggleDone() {
    this.done = !this.done;
  }

  //　表示用（デバックや一覧表示に便利）
  @Override
  public String toString() {
    return (done ? "[x]" : "[ ]") + title;
  }
}
