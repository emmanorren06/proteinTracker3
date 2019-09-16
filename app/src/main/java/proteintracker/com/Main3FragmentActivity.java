package proteintracker.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3FragmentActivity extends AppCompatActivity
        implements BlankFragment.SendMessage{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_fragment);

        Button btnPress = findViewById(R.id.btnFragment);
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                BlankFragment proteinFragment = BlankFragment.newInstance("Hai", "Para Progmobers");
                ft.replace(R.id.FrameMain, proteinFragment);
                ft.commit();
            }
        });
    }

    @Override
    public void SendData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        BlankFragment2 protein2Fragment = BlankFragment2.newInstance(Message,"Para Progmobers");
        ft.replace(R.id.FrameMain, protein2Fragment);
        ft.commit();
    }
}
