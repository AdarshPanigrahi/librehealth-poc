package com.adarshpanig.librehealthpoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HospitalsResult extends AppCompatActivity {
    RecyclerView recyclerView2;
    RecyclerAdapter2 recyclerAdapter2;
   public static String result;

    List<String> ToothExtraction;
    List<String> ToothExtractionHospitals;
    List<String> ToothExtractionPrices;

    List<String> HeartAttack;
    List<String> HeartAttackHospitals;
    List<String> HeartAttackPrices;

    List<String> Asthma;
    List<String> AsthmaHospitals;
    List<String> AsthmaPrices;

    List<String> Diabetes;
    List<String> DiabetesHospitals;
    List<String> DiabetesPrices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals_result);


        //---------------------Dummy Data ------------------------------------------


        ToothExtraction = new ArrayList<>();
        ToothExtractionHospitals= new ArrayList<>();
        ToothExtractionPrices = new ArrayList<>();
        HeartAttack = new ArrayList<>();
        HeartAttackHospitals = new ArrayList<>();
        HeartAttackPrices = new ArrayList<>();
        Asthma = new ArrayList<>();
        AsthmaHospitals = new ArrayList<>();
        AsthmaPrices = new ArrayList<>();
        Diabetes = new ArrayList<>();
        DiabetesHospitals = new ArrayList<>();
        DiabetesPrices = new ArrayList<>();


        recyclerView2=findViewById(R.id.recyclerView2);
        recyclerAdapter2 = new RecyclerAdapter2(ToothExtraction,ToothExtractionHospitals,ToothExtractionPrices,
                HeartAttack,HeartAttackHospitals,HeartAttackPrices,Asthma,AsthmaHospitals,AsthmaPrices,Diabetes,
                DiabetesHospitals,DiabetesPrices);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.setAdapter(recyclerAdapter2);


        ToothExtraction.add("TOOTH EXTRACTION");
        ToothExtraction.add("DENTAL EXTRACTION");
        ToothExtraction.add("TOOTH EXTRACTION");
        ToothExtraction.add("TOOTH EXTRACTION");
        ToothExtraction.add("TOOTH EXTRACTION");
        ToothExtraction.add("TOOTH EXTRACTION");
        ToothExtraction.add("DENTAL EXTRACTION");
        ToothExtraction.add("TOOTH EXTRACTION");
        ToothExtraction.add("TOOTH EXTRACTION");
        ToothExtraction.add("TOOTH EXTRACTION");

        ToothExtractionHospitals.add("FMS Dental Hospital");
        ToothExtractionHospitals.add("York Hospital Dental Center");
        ToothExtractionHospitals.add("Emergency Dental Care USA");
        ToothExtractionHospitals.add("Emergency Dental Care USA");
        ToothExtractionHospitals.add("The Oral Surgery and Implant Center");
        ToothExtractionHospitals.add("FMS Dental Hospital");
        ToothExtractionHospitals.add("York Hospital Dental Center");
        ToothExtractionHospitals.add("Emergency Dental Care USA");
        ToothExtractionHospitals.add("Emergency Dental Care USA");
        ToothExtractionHospitals.add("The Oral Surgery and Implant Center");

        ToothExtractionPrices.add("300");
        ToothExtractionPrices.add("400");
        ToothExtractionPrices.add("450");
        ToothExtractionPrices.add("550");
        ToothExtractionPrices.add("600");
        ToothExtractionPrices.add("600");
        ToothExtractionPrices.add("700");
        ToothExtractionPrices.add("750");
        ToothExtractionPrices.add("850");
        ToothExtractionPrices.add("900");


        HeartAttack.add("HEART ATTACK DIAGNOSE");
        HeartAttack.add("HEART CHECK UP");
        HeartAttack.add("HEART ATTACK DIAGNOSE");
        HeartAttack.add("HEART STROKE DIAGNOSE");
        HeartAttack.add("HEART CHECK UP");
        HeartAttack.add("HEART ATTACK DIAGNOSE");
        HeartAttack.add("HEART CHECK UP");
        HeartAttack.add("HEART ATTACK DIAGNOSE");
        HeartAttack.add("HEART STROKE DIAGNOSE");
        HeartAttack.add("HEART CHECK UP");

        HeartAttackHospitals.add("USA Heart Center");
        HeartAttackHospitals.add("Heart Clinic Louisiana");
        HeartAttackHospitals.add("Cleveland Clinic Cardiology");
        HeartAttackHospitals.add("Mayo Clinic Cardiology");
        HeartAttackHospitals.add("Jackson Heart Clinic Madison");
        HeartAttackHospitals.add("USA Heart Center");
        HeartAttackHospitals.add("Heart Clinic Louisiana");
        HeartAttackHospitals.add("Cleveland Clinic Cardiology");
        HeartAttackHospitals.add("Mayo Clinic Cardiology");
        HeartAttackHospitals.add("Jackson Heart Clinic Madison");

        HeartAttackPrices.add("25320");
        HeartAttackPrices.add("28600");
        HeartAttackPrices.add("34590");
        HeartAttackPrices.add("42323");
        HeartAttackPrices.add("56780");
        HeartAttackPrices.add("65320");
        HeartAttackPrices.add("68600");
        HeartAttackPrices.add("74590");
        HeartAttackPrices.add("82323");
        HeartAttackPrices.add("86780");


        Asthma.add("ASTHMA CHECK UP");
        Asthma.add("ASTHMA CHECK UP");
        Asthma.add("ASTHMA CHECK UP");
        Asthma.add("ASTHMA CHECK UP");
        Asthma.add("ASTHMA CHECK UP");
        Asthma.add("ASTHMA CHECK UP");
        Asthma.add("ASTHMA CHECK UP");
        Asthma.add("ASTHMA CHECK UP");
        Asthma.add("ASTHMA CHECK UP");
        Asthma.add("ASTHMA CHECK UP");

        AsthmaHospitals.add("Allergy & Asthma Associates");
        AsthmaHospitals.add("Alabama Allergy & Asthma Center");
        AsthmaHospitals.add("Rockefeller University Hospital");
        AsthmaHospitals.add("Asthma Program");
        AsthmaHospitals.add("Allergy & Asthma Care Center");
        AsthmaHospitals.add("Allergy & Asthma Associates");
        AsthmaHospitals.add("Alabama Allergy & Asthma Center");
        AsthmaHospitals.add("Rockefeller University Hospital");
        AsthmaHospitals.add("Asthma Program");
        AsthmaHospitals.add("Allergy & Asthma Care Center");

        AsthmaPrices.add("750");
        AsthmaPrices.add("830");
        AsthmaPrices.add("900");
        AsthmaPrices.add("1200");
        AsthmaPrices.add("1250");
        AsthmaPrices.add("1250");
        AsthmaPrices.add("1280");
        AsthmaPrices.add("1300");
        AsthmaPrices.add("1340");
        AsthmaPrices.add("1450");

        Diabetes.add("DIABETES CHECKUP");
        Diabetes.add("DIABETES CHECKUP");
        Diabetes.add("DIABETES CHECKUP");
        Diabetes.add("DIABETES CHECKUP");
        Diabetes.add("DIABETES CHECKUP");
        Diabetes.add("DIABETES CHECKUP");
        Diabetes.add("DIABETES CHECKUP");
        Diabetes.add("DIABETES CHECKUP");
        Diabetes.add("DIABETES CHECKUP");
        Diabetes.add("DIABETES CHECKUP");

        DiabetesHospitals.add("University of Virginia Health System");
        DiabetesHospitals.add("MCH Diabetes Center");
        DiabetesHospitals.add("Joslin Diabetes Center");
        DiabetesHospitals.add("Anderson Diabetes Center");
        DiabetesHospitals.add("Englewood Hospital and Medical Center");
        DiabetesHospitals.add("University of Virginia Health System");
        DiabetesHospitals.add("MCH Diabetes Center");
        DiabetesHospitals.add("Joslin Diabetes Center");
        DiabetesHospitals.add("Anderson Diabetes Center");
        DiabetesHospitals.add("Englewood Hospital and Medical Center");

        DiabetesPrices.add("440");
        DiabetesPrices.add("480");
        DiabetesPrices.add("556");
        DiabetesPrices.add("656");
        DiabetesPrices.add("690");
        DiabetesPrices.add("740");
        DiabetesPrices.add("780");
        DiabetesPrices.add("856");
        DiabetesPrices.add("896");
        DiabetesPrices.add("990");



        SearchView searchView4 = findViewById(R.id.search_bar4);
        Intent intent = getIntent();
        result= intent.getStringExtra(RecyclerAdapter.diseaseName);
        if(result==null)
            result =intent.getStringExtra(SearchHospital.dname);

        searchView4.setQuery(result,true);
        searchView4.setFocusable(false);
    }
}
