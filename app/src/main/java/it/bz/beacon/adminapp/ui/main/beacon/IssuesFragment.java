package it.bz.beacon.adminapp.ui.main.beacon;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import it.bz.beacon.adminapp.data.entity.Beacon;
import it.bz.beacon.adminapp.data.entity.BeaconMinimal;
import it.bz.beacon.adminapp.data.viewmodel.BeaconViewModel;

public class IssuesFragment extends BaseBeaconsFragment {

    private BeaconViewModel beaconViewModel;

    public IssuesFragment() {
        // Required empty public constructor
    }

    public static IssuesFragment newInstance() {
        IssuesFragment fragment = new IssuesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        beaconViewModel = ViewModelProviders.of(this).get(BeaconViewModel.class);
    }

    @Override
    protected void getBeacons(Observer<List<BeaconMinimal>> observer) {
        beaconViewModel.getAll().observe(this, observer);
    }
}
