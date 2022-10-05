package android.example.todo;


import android.example.todo.database.AppDatabase;
import android.example.todo.database.TaskEntry;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class AddTaskViewModel extends ViewModel {


    private LiveData<TaskEntry> task;


    public AddTaskViewModel(AppDatabase database, int taskId) {
        task = database.taskDao().loadTaskById(taskId);
    }

    public LiveData<TaskEntry> getTask() {
        return task;
    }
}
