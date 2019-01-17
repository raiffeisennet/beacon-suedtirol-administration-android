package it.bz.beacon.adminapp.ui.main.beacon;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;

import java.util.List;

import it.bz.beacon.adminapp.data.entity.BeaconMinimal;
import it.bz.beacon.adminapp.data.viewmodel.BeaconViewModel;

public class AllBeaconsFragment extends BaseBeaconsFragment {

    private BeaconViewModel beaconViewModel;

    public AllBeaconsFragment() {
        // Required empty public constructor
    }

    public static AllBeaconsFragment newInstance() {
        AllBeaconsFragment fragment = new AllBeaconsFragment();
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
