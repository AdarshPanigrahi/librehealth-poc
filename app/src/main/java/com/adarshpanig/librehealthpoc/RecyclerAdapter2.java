package com.adarshpanig.librehealthpoc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter2 extends RecyclerView.Adapter<RecyclerAdapter2.ViewHolder2> {
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
    String result1 ="tooth extraction";
    String result2 = "diabetes";
    String result3 = "heart attack";
    String result4 = "asthma";

    public RecyclerAdapter2( List<String> ToothExtraction,
            List<String> ToothExtractionHospitals,
            List<String> ToothExtractionPrices,

            List<String> HeartAttack,
            List<String> HeartAttackHospitals,
            List<String> HeartAttackPrices,

            List<String> Asthma,
            List<String> AsthmaHospitals,
            List<String> AsthmaPrices,

            List<String> Diabetes,
            List<String> DiabetesHospitals,
            List<String> DiabetesPrices) {

        this.ToothExtraction=ToothExtraction;
        this.ToothExtractionHospitals=ToothExtractionHospitals;
        this.ToothExtractionPrices=ToothExtractionPrices;
        this.HeartAttack=HeartAttack;
        this.HeartAttackHospitals=HeartAttackHospitals;
        this.HeartAttackPrices=HeartAttackPrices;
        this.Asthma=Asthma;
        this.AsthmaHospitals=AsthmaHospitals;
        this.AsthmaPrices=AsthmaPrices;
        this.Diabetes=Diabetes;
        this.DiabetesHospitals=DiabetesHospitals;
        this.DiabetesPrices=DiabetesPrices;
    }

    @NonNull
    @Override
    public ViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater2 = LayoutInflater.from(parent.getContext());
        View view2 = layoutInflater2.inflate(R.layout.row_item_hospital,parent,false);
        RecyclerAdapter2.ViewHolder2 viewHolder2 = new RecyclerAdapter2.ViewHolder2(view2);
        return viewHolder2;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder2 holder, int position) {
         if( HospitalsResult.result.compareTo(result1)==0){
             holder.dName.setText(ToothExtraction.get(position));
             holder.hName.setText(ToothExtractionHospitals.get(position));
             holder.dollar.setText("$"+ToothExtractionPrices.get(position));
            // holder.img1.setImageResource(R.drawable.globe);
             //holder.img2.setImageResource(R.drawable.getdirections);
         }
          else if( HospitalsResult.result.compareTo(result2)==0){
             holder.dName.setText(Diabetes.get(position));
             holder.hName.setText(DiabetesHospitals.get(position));
             holder.dollar.setText("$"+DiabetesPrices.get(position));
//             holder.img1.setImageResource(R.drawable.globe);
//             holder.img2.setImageResource(R.drawable.getdirections);
         }
         else if( HospitalsResult.result.compareTo(result3)==0){
             holder.dName.setText(HeartAttack.get(position));
             holder.hName.setText(HeartAttackHospitals.get(position));
             holder.dollar.setText("$"+HeartAttackPrices.get(position));
//             holder.img1.setImageResource(R.drawable.globe);
//             holder.img2.setImageResource(R.drawable.getdirections);
         }
         else if( HospitalsResult.result.compareTo(result4)==0){
             holder.dName.setText(Asthma.get(position));
             holder.hName.setText(AsthmaHospitals.get(position));
             holder.dollar.setText("$"+AsthmaPrices.get(position));
//             holder.img1.setImageResource(R.drawable.globe);
//             holder.img2.setImageResource(R.drawable.getdirections);
         }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ViewHolder2 extends RecyclerView.ViewHolder implements View.OnClickListener{

          TextView dName,hName,dollar;
          ImageView img1,img2;
        public ViewHolder2(@NonNull View itemView) {
            super(itemView);

             dName=itemView.findViewById(R.id.dName);
             hName=itemView.findViewById(R.id.hName);
             dollar=itemView.findViewById(R.id.dollar);
            // img1=itemView.findViewById(R.id.img1);
             //img2=itemView.findViewById(R.id.img2);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
