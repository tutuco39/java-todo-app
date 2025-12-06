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

  public void removeTasks(int index) {
    tasks.remove(index);
  }
}
