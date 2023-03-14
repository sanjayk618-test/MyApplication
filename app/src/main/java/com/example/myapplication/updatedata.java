package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.SupportMapFragment;

public class updatedata extends AppCompatActivity
{
    Bundle bundle=new Bundle();

    private View addressdata;
    private Button submitbutton;

    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.updatedata);

        submitbutton = findViewById(R.id.button4);
       String myaddress=MyLocationLayerActivity.Addressvalue;


        EditText vegtype = (EditText) findViewById(R.id.TypofFV);  //  Type of Vegetable / Fruit Grown


        EditText acergrowing = (EditText) findViewById(R.id.acersgrown); //  In How many Acers it has grown


        EditText next6mon = (EditText) findViewById(R.id.mfv6); //What type of Vegetable / Fruit you will grow in next 6 months



        EditText howmany = (EditText) findViewById(R.id.howmany6); //In How many acres you will grow





        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String vegtype1 = vegtype.getText().toString();
                String acergrowing1 = acergrowing.getText().toString();
                String next6mon1 = next6mon.getText().toString();
                String howmany1 = howmany.getText().toString();





                Log.d("updatedata", "Address " +myaddress+ "Vegtable Type " +vegtype1+ "AcersGrowing"
                        + acergrowing1 + "Which Veg Next 6 months" + next6mon1 + "How man acers you are growing" + howmany1);

                Intent i = new Intent(updatedata.this, subsuccess.class);
                startActivity(i);
                finish();
            }
        });




    }
}
