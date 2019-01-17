package it.bz.beacon.adminapp.data.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import java.util.ArrayList;
import java.util.List;

import it.bz.beacon.adminapp.data.entity.Beacon;
import it.bz.beacon.adminapp.data.entity.BeaconMinimal;

@Dao
public abstract class BeaconDao implements BaseDao<Beacon> {

    // TODO: Check if all fields have to be specified explicitly (or if "SELECT *" is fine as well)
    @Transaction
    @Query("SELECT * FROM Beacon ORDER BY name ASC")
    public abstract LiveData<List<BeaconMinimal>> getAll();

    @Query("SELECT * FROM Beacon WHERE id = :id")
    public abstract LiveData<Beacon> getById(long id);

    @Transaction
    public void replaceAll(ArrayList<Beacon> beacons) {
        deleteAll();
        insertMultiple(beacons);
    }

    @Query("DELETE FROM Beacon")
    abstract void deleteAll();
}
