package com.example.aashimagarg.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText etEditItem;
    int itemIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        //instantiate
        etEditItem = (EditText) findViewById(R.id.etEditItem);
        etEditItem.setText(getIntent().getStringExtra("passedItem"));
        itemIndex = getIntent().getIntExtra("index", 0);
    }

    public void onSubmitChange(View view){
        // closes the activity and returns to main screen

        Intent data = new Intent();

        data.putExtra("passedBackItem", ((EditText) findViewById(R.id.etEditItem)).getText().toString());
        data.putExtra("passedBackIndex", itemIndex);

        // Activity finished ok, return the data
        setResult(RESULT_OK, data); // set result code and bundle data for response

        finish();
    }

}
