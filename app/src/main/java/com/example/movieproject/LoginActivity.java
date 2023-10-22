package com.example.movieproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextUserName, editTextPassword;
    private Button btn_login;
    private String userName, password;
    private SharedPreferences s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        s = getSharedPreferences("malak",MODE_PRIVATE);
        boolean login= s.getBoolean("login",false);

        userName = s.getString("username","");
        password = s.getString("password","");

        if (login){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        editTextUserName = (EditText) findViewById(R.id.editTextUserName);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (editTextUserName.getText().toString().isEmpty() || editTextPassword.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "الرجاء ملى الحقول الفارغة.", Toast.LENGTH_LONG).show();

                } else if (editTextUserName.getText().toString().equals(userName) && editTextPassword.getText().toString().equals(password)) {
                    SharedPreferences.Editor myEdit = s.edit();
                    myEdit.putBoolean("login", true);
                    myEdit.apply();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else
                    Toast.makeText(getApplicationContext(), "اسم المستخدم او كلمة المرور ليس صحيحآ الرجاء التاكد.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}