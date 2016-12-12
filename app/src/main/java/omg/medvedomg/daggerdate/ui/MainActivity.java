package omg.medvedomg.daggerdate.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import omg.medvedomg.daggerdate.MyApp;
import omg.medvedomg.daggerdate.MyDate;
import omg.medvedomg.daggerdate.R;

public class MainActivity extends AppCompatActivity {

    @Inject
    MyDate myDate;

    private TextView dateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApp) getApplication()).getComponent().inject(this);
        dateTextView = (TextView) findViewById(R.id.date_text);
        dateTextView.setText(myDate.getMyDate());
//        Toast.makeText(this, "Date is " + myDate.getMyDate(), Toast.LENGTH_SHORT).show();
    }
}
