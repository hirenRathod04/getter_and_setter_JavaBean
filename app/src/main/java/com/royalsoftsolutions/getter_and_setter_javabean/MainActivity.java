package com.royalsoftsolutions.getter_and_setter_javabean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView tvGetname;
private EditText etSetname;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        etSetname = findViewById ( R.id.et_Setname ) ;
        tvGetname = findViewById ( R.id.tv_Getname );
        button = findViewById ( R.id.button );

        String name = etSetname.getText().toString().trim ();



        button.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {


                Log.d("Name : ",name);

                JavaBean_getter_setter.Employee e = new JavaBean_getter_setter.Employee ();//object is created
                e.setName(name);//setting value to the object
                String  getname = e.getName ().trim ();//getting value to the object
                tvGetname.setText(getname);



            }
        } );

    }




}


