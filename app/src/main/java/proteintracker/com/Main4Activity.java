package proteintracker.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity implements BlankFragmentMhsUpdateDelete.SendData,BlankFragment4Mahasiswa.SendData2{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        click2();
    }
    public void click (){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        BlankFragment4Mahasiswa fragmentCRUD = new BlankFragment4Mahasiswa();
        ft.replace(R.id.frameMain, fragmentCRUD);
        ft.commit();
    }

    public void click2(){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        BlankFragmentMhsUpdateDelete fragmentMhs = new BlankFragmentMhsUpdateDelete();
        ft.replace(R.id.frameMain, fragmentMhs);
        ft.commit();
    }

}
