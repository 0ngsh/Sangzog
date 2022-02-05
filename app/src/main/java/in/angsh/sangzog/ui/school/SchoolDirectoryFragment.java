package in.angsh.sangzog.ui.school;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;


import in.angsh.sangzog.databinding.FragmentSchoolBinding;

public class SchoolDirectoryFragment extends Fragment {

    private SchoolDirectoryViewModel schoolDirectoryViewModel;
    private FragmentSchoolBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        schoolDirectoryViewModel =
                new ViewModelProvider(this).get(SchoolDirectoryViewModel.class);

        binding = FragmentSchoolBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        schoolDirectoryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}