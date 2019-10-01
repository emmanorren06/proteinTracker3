package proteintracker.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener helpButtonListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);
            Bundle b = new Bundle();
            EditText myEditText = (EditText)findViewById(R.id.editText);
            b.putString("HelpString",myEditText.getText().toString());
            intent.putExtras(b);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);

        Button helpBtn = (Button) findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);

        Button btnlayout = (Button) findViewById(R.id.buttonLayout);

        Button appBtn = (Button)findViewById(R.id.appButton);

        Button fragmentbtn = (Button)findViewById(R.id.buttonFragment);

        Button btnMahasiswa = (Button)findViewById(R.id.btnMahasiswa);

        Button btnList = (Button)findViewById(R.id.btnList);

        Button btnKelMhs = (Button) findViewById(R.id.btnKelolaMhs);

        Button btnRVmhs = (Button) findViewById(R.id.btnRVmhs);

        Button btnMhsSI = (Button) findViewById(R.id.btnMhsSI);
        btnMhsSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,RecyclerMhsActivity.class);
                startActivity(i);
            }
        });

        btnRVmhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,RecyclerViewActivity.class);
                startActivity(i);
            }
        });

        btnKelMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainKelolaActivity.class);
                startActivity(i);
            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ListActivity.class);
                startActivity(i);
            }
        });
        btnMahasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(i);
            }
        });
        fragmentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Main3FragmentActivity.class);
                startActivity(i);
            }
        });
        appBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(i);
            }
        });
        btnlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });

        Button myBtn = (Button)findViewById(R.id.button);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText)findViewById(R.id.editText);
                Log.d("ProteinTracker",myEditText.getText().toString());

            }

        });
        if(savedInstanceState != null) {
            Log.d("ProteinTracker", savedInstanceState.getString("abc"));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("abc","test");
        super.onSaveInstanceState(outState);
    }

}
