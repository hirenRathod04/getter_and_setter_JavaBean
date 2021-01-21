package com.royalsoftsolutions.getter_and_setter_javabean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView textView_name;
private EditText editText_name;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

                textView_name = findViewById ( R.id.tv_name );
        editText_name = findViewById ( R.id.editTextTextPersonName ) ;
        button = findViewById ( R.id.button );





        button.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                String emailString = (String) editText_name.getText().toString();
                Log.d("email",emailString);
                JavaBean_getter_setter.Employee e = new JavaBean_getter_setter.Employee ();//object is created
                e.setName(emailString);//setting value to the object
                String   textView_name1 = e.getName ().trim ();
                textView_name.setText(textView_name1);



            }
        } );

    }




}


