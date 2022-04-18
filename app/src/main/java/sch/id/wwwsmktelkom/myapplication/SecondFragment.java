package sch.id.wwwsmktelkom.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class SecondFragment extends Fragment {
    private PageViewModel pageViewModel;
    private TextView txtViewName, txtViewNumber, txtViewAddress, txtViewSchool;
    public SecondFragment () {

    }

    public static SecondFragment newInstance() {
        return new SecondFragment();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// initialise ViewModel here
        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtViewName = view.findViewById(R.id.textViewName);
        txtViewNumber = view.findViewById(R.id.textViewNumber);
        txtViewAddress = view.findViewById(R.id.textViewAddress);
        txtViewSchool = view.findViewById(R.id.textViewSchool);
        pageViewModel.getName().observe(requireActivity(), new Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String name) {
                        txtViewName.setText(name);
                    }
                });
        pageViewModel.getNumber().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String number) {
                txtViewNumber.setText(number);
            }
        });
        pageViewModel.getAddress().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String address) {
                txtViewAddress.setText(address);
            }
        });
        pageViewModel.getSchool().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String school) {
                txtViewSchool.setText(school);
            }
        });
    }
     }
