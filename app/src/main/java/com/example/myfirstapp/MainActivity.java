package com.example.myfirstapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


import com.example.user.playingwithheadfirst.MallardDuck;
import com.example.user.playingwithheadfirst.ModelDuck;

import static com.example.myfirstapp.R.array.duck_subclass_array;

public class MainActivity extends AppCompatActivity  implements android.widget.AdapterView.OnItemSelectedListener {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private Spinner spinner;
    private TextView textViewDisplay;
    private TextView textViewQuack;
    private TextView textViewFly;
    private String[] duckTypes;

    private singletonEventManager _instance = singletonEventManager.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitializeDUckTypesFromRessource();
        InitializeTextViews();
        addItemsOnSpinner();
        addListenerOnSpinnerItemSelection();
    }

    private void InitializeDUckTypesFromRessource() {

        Resources res = getResources();
        duckTypes = res.getStringArray(R.array.duck_subclass_array);

    }


    private void InitializeTextViews() {

        textViewDisplay =(TextView)findViewById(R.id.textView);
        textViewQuack =(TextView)findViewById(R.id.textView2);
        textViewFly =(TextView)findViewById(R.id.textView3);

    }

    private void addListenerOnSpinnerItemSelection() {

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
    }

    private void addItemsOnSpinner() {

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> dataAdapter = ArrayAdapter.createFromResource(this,
                R.array.duck_subclass_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(dataAdapter);
    }

    /** Called when the user taps the Send button */
    public void sendDisplay(View view){

        String instanceValue = _instance.getDuckSubclassName();
        String value0 = duckTypes[0];
        String message = new String();

        if(_instance.getDuckSubclassName().equals(duckTypes[0].toString())){
            message = new MallardDuck().Display();
        }
        else if (_instance.getDuckSubclassName().equals(duckTypes[1])) {

            message = new ModelDuck().Display();

        }

        textViewDisplay.setText(message);

    }


    public void sendQuack(View view){
        String message = new String();
       if(_instance.getDuckSubclassName().equals(duckTypes[0])){
            message = new MallardDuck().performQuack();
       }
       else if (_instance.getDuckSubclassName().equals(duckTypes[1])) {

           message = new ModelDuck().performQuack();
       }
        textViewQuack.setText(message);

    }


    public void sendFly(View view){
        String message = new String();
        if(_instance.getDuckSubclassName().equals(duckTypes[0])){
            message = new MallardDuck().performFly();

        }
        else if (_instance.getDuckSubclassName().equals(duckTypes[1])) {

            message = new ModelDuck().performFly();
        }

        textViewFly.setText(message);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        // parent.getItemAtPosition(pos).toString()

        String selectedItem = adapterView.getItemAtPosition(i).toString();
        _instance.setDuckSubclassName(selectedItem);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
