import java.util.ArrayList;
import java.util.List;

public class TaskManager {
  private List<Task> tasks = new ArrayList<>();

  public void addTask(String title) {
    tasks.add(new Task(title));
  }

  //　Mainにデータを渡すだけ
  public List<Task> getTasks() {
    return tasks;
  }

  public void showTasks() {
    for (int i = 0; i < tasks.size(); i++) {
      System.out.println(i + ":" + tasks.get(i));
    }
  }

  public void toggleDone(int index) {
    if (index < 0 || index >= tasks.size()) {
      System.out.println("△index不正： " + index);
      return;
    }

    // 中のデータが変わっているのか確認するため
     System.out.println("Before: " + tasks.get(index).isDone());
     tasks.get(index).toggleDone();
     System.out.println("After: " + tasks.get(index).isDone());
  }

  public void removeTask(int index) {
    tasks.remove(index);
  }

}
