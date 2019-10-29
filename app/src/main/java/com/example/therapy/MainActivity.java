package com.example.therapy;

import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Doctor> doctors = new ArrayList<>();
    private RecyclerView recyclerView;
    private DoctorAdapter dAdapter;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.doc_recycler);

        dAdapter = new DoctorAdapter(doctors,this);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(dAdapter);

        populateDoctorDetails();
        dAdapter.notifyDataSetChanged();

        getSupportActionBar().setTitle("Find a Therapist");

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_view, menu);

        return true;

    }
    public void P1_bay(View view) {
        Intent intent = new Intent(MainActivity.this, TherapistProfile.class);
        startActivity(intent);
    }
    private void populateDoctorDetails() {
            Doctor doctor;

            doctor  = new Doctor("Dr Mona Mossad","Anger ,Depression","$100","4.0","Available today at 03:20 pm","English");
            doctors.add(doctor);
            doctor = new Doctor("Dr Ayman Zedan","Depression, Schizophrenia","$160","3.5","Available from May 19","Arabic, English");
            doctors.add(doctor);
            doctor = new Doctor("Dr Somaya Abboud,MD","Child Psychology Specialist","$320","4.5","Available today at 08:20 pm","English,French");
            doctors.add(doctor);
            doctor = new Doctor("Dr Nehal Galal","Ph.D Psychology","$340","4.0","Available today at 03:20 pm","English");
            doctors.add(doctor);
            doctor = new Doctor("Dr Nehal Galal","Ph.D Psychology","$340","4.0","Available today at 03:20 pm","English");
            doctors.add(doctor);

    }
}
