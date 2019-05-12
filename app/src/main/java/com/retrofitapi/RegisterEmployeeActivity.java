package com.retrofitapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import model.EmployeeCUD;

public class RegisterEmployeeActivity extends AppCompatActivity {

    private final static String BASE_URL = "http://dummy.restapiexample.com/api/V1/";
    private EditText etName, etSalary, etAge;
    private Button btnRegisterEmployee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_employee);

        etName=findViewById(R.id.etName);
        etSalary=findViewById(R.id.etSalary);
        etAge=findViewById(R.id.etAge);
        btnRegisterEmployee=findViewById(R.id.btnRegisterEmployee);
        
        btnRegisterEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register();
            }
        });
    }

    private void Register() {

        String name=etName.getText().toString();
        Float salary=Float.parseFloat(etSalary.getText().toString());
        int age=Integer.parseInt(etAge.getText().toString());

    }
}
