package com.example.admin.balaveksha;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Profile extends AppCompatActivity {

    private String Gender;

    private AutoCompleteTextView mFnameView;
    private AutoCompleteTextView mLnameView;
    private AutoCompleteTextView mEmailView;
    private AutoCompleteTextView mUnameView;
    private AutoCompleteTextView mPasswordView;
    private AutoCompleteTextView mDobView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        Toolbar mToolbar =(Toolbar) findViewById(R.id.nav_actionbarhide);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setTitle("Setup your Profile");



     //   final EditText etFname=(EditText) findViewById(R.id.editFName);
        //final EditText etLname=(EditText) findViewById(R.id.editLName);
      //  final EditText etEmail=(EditText) findViewById(R.id.email);
      //  final EditText etUname=(EditText) findViewById(R.id.editUName);
      //  final EditText etPassword=(EditText) findViewById(R.id.password);
      //  final EditText etDOB=(EditText) findViewById(R.id.dob);

        final Button bSave=(Button) findViewById(R.id.save);


        mFnameView = (AutoCompleteTextView) findViewById(R.id.editFName);
        mLnameView = (AutoCompleteTextView) findViewById(R.id.editLName);
        mEmailView = (AutoCompleteTextView) findViewById(R.id.editEmail);
        mUnameView = (AutoCompleteTextView) findViewById(R.id.editUName);
        mPasswordView = (AutoCompleteTextView) findViewById(R.id.editPassword);
        mDobView= (AutoCompleteTextView) findViewById(R.id.dob);



        Intent intent= getIntent();

        String Firstname=intent.getStringExtra("fname");

        String Lastname=intent.getStringExtra("lname");

        String Email=intent.getStringExtra("email");

        String Username=intent.getStringExtra("username");

        String Password=intent.getStringExtra("password");






        mFnameView.setText(Firstname);
        mLnameView.setText(Lastname);
        mEmailView.setText(Email);
        mUnameView.setText(Username);
        mPasswordView.setText(Password);


/**

        bSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final String Fname = etFname.getText().toString();
                final String Lname = etLname.getText().toString();
                final String Email = etEmail.getText().toString();
                final String Uname = etUname.getText().toString();
                final String Password = etPassword.getText().toString();
                final String DateofBirth = etDOB.getText().toString();
                final String gender="Gender";


                Response.Listener<String>responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try{

                            JSONObject jsonResponse = new JSONObject(response);

                            boolean success=jsonResponse.getBoolean("success");

                            if(success){

                                Intent intent = new Intent(Profile.this,ChildNavbar.class);
                                Profile.this.startActivity(intent);
                                finish();


                            }

                            else{

                                AlertDialog.Builder builder = new AlertDialog.Builder(Profile.this);

                                builder.setMessage("Not Saved")
                                        .setNegativeButton("Retry",null)
                                        .create()
                                        .show();


                            }

                        }catch (JSONException e){

                            e.printStackTrace();

                        }

                    }
                };


                SaveRequest saveRequest=new SaveRequest(Fname,Lname,Email,Uname,Password,DateofBirth,gender,responseListener);

                RequestQueue queue = Volley.newRequestQueue(Profile.this);

                queue.add(saveRequest);


            }
        });


**/
    }

    public void radioButtonClicked(View view) {

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioMale:
                if (checked) {
                    Toast.makeText(getApplicationContext(), " Male", Toast.LENGTH_SHORT).show();

                    Gender= "Male";
                    break;
                }
            case R.id.radioFemale:
                if (checked) {
                    Toast.makeText(getApplicationContext(), " Female", Toast.LENGTH_SHORT).show();
                    Gender= "Female";
                    break;
                }

        }


    }

}
