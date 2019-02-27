package com.chemwater.week3day2;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent ;
import android.view.View ;
import android.widget.EditText ;

public class DataEntryActivity extends Activity {


    //Constants
    public static final String KEY_STUDENT_RESULT = "student_result" ;
    public static final int RESULT_CODE = 656 ;

    //Declare views
    EditText studentId, etStudentNameDisplay, etStudentMajorDisplay, etStudentMinorDisplay, etExpectedGradYearDisplay, etStudentGPADisplay, etCompletedHoursDisplay ;

    //The Intent that started this activity
    Intent sentIntent ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_entry);
        sentIntent = getIntent() ; //gets intent that started the activity
        bindViews() ;
    }

    //Bind Views to xml elements
    //@return void
    public void bindViews() {
        etStudentNameDisplay = (EditText) findViewById(R.id.etStudentName) ;
        etStudentMajorDisplay = (EditText) findViewById(R.id.etStudentMajor) ;
        etStudentMinorDisplay = (EditText) findViewById(R.id.etStudentMinor) ;
        etExpectedGradYearDisplay = (EditText) findViewById(R.id.etExpectedGradYear) ;
        etStudentGPADisplay = (EditText) findViewById(R.id.etStudentGPA) ;
        etCompletedHoursDisplay = (EditText) findViewById(R.id.etCompletedHours) ;
    }


    //
    //Create Student Object
    //@return Student The new student object
    //
    public Student generateStudentObjectFromInput() {
        Student returnStudent = new Student() ;

        //Set-up Student object
        returnStudent.setStudentName(etStudentNameDisplay.getText() != null ? etStudentNameDisplay.getText().toString() : " ") ;

        returnStudent.setStudentMajor(etStudentMajorDisplay.getText() != null ? etStudentMajorDisplay.getText().toString() : " ") ;

        returnStudent.setStudentMinor(etStudentMinorDisplay.getText() != null ? etStudentMinorDisplay.getText().toString() : " ") ;

        returnStudent.setExpectedGradYear(etExpectedGradYearDisplay.getText() != null ? etExpectedGradYearDisplay.getText().toString() : " ") ;

        returnStudent.setStudentGPA(etStudentGPADisplay.getText() != null ? etStudentGPADisplay.getText().toString() : " ") ;

        returnStudent.setCompletedHours(etCompletedHoursDisplay.getText() != null ? etCompletedHoursDisplay.getText().toString() : " ") ;

        return returnStudent ;
    }

    public void onClick(View view) {
        Student studentResult = generateStudentObjectFromInput() ;
        Bundle bundleOfTheStudentResult = new Bundle() ;
        bundleOfTheStudentResult.putParcelable(KEY_STUDENT_RESULT, studentResult) ; //put car object in bundle
        sentIntent.putExtras(bundleOfTheStudentResult) ; //attach the result bundle to intent
        setResult(RESULT_CODE, sentIntent) ; //send back bundle with result to activity which called it for result
        finish() ; //Make sure the activity is flagged to be destroyed

    }



}