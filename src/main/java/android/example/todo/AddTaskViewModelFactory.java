package android.example.todo;

import android.example.todo.database.AppDatabase;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {


    private final AppDatabase mDb;
    private final int mTaskId;


    public AddTaskViewModelFactory(AppDatabase database, int taskId) {
        mDb = database;
        mTaskId = taskId;
    }


    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        //noinspection unchecked
        return (T) new AddTaskViewModel(mDb, mTaskId);
    }
}
