package pl.edu.pb.myapplication;

import androidx.fragment.app.Fragment;

public class TaskListActivity extends SingleFragmentActivity {
    protected Fragment createFragment() {
        return new TaskListFragment();
    }
}