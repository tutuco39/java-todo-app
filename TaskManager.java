import java.util.ArrayList;
import java.util.List;

public class TaskManager {
  private List<Task> tasks = new ArrayList<>();

  public void addTask(Task task) {
    tasks.add(task);
  }

  public void showTasks() {
    for (int i = 0; i < tasks.size(); i++) {
      System.out.println(i + ":" + tasks.get(i));
    }
  }

  public void toggleDone(int index) {
    Task task = tasks.get(index);
    task.toggleDone();
  }

  public void removeTask(int index) {
    tasks.remove(index);
  }
}
