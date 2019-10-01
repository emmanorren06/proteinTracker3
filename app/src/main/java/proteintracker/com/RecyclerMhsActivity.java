package proteintracker.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import proteintracker.com.Adapter.MHSAdapter;
import proteintracker.com.Model.MhsSI;

public class RecyclerMhsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MHSAdapter mhsAdapter;
    private ArrayList<MhsSI> mhsSIArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_mhs);

        addData();

        recyclerView = findViewById(R.id.rvDataMhs);
        mhsAdapter = new MHSAdapter(mhsSIArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(RecyclerMhsActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mhsAdapter);
    }
    private  void addData(){
        mhsSIArrayList = new ArrayList<>();
        mhsSIArrayList.add(new MhsSI("Frizk F.Nainggolan","72170157",
                "Perempuan","Menggambar","Punya banyak anjing","Let's Life Without Regret",R.drawable.frizka));
        mhsSIArrayList.add(new MhsSI("Cynthia Kumalasari","72170101",
                "Perempuan","Gym","President Team Herbalife","No Pain, No Gain",R.drawable.cyntia));
        mhsSIArrayList.add(new MhsSI("Ivan Bernov","72170149",
                "Laki-laki","Traveling","Pembalap","Yang Lalu Biarlah Berlalu Sesungguhnya Yang Baru Sudah Datang ",R.drawable.ivan));
        mhsSIArrayList.add(new MhsSI("Daniel Surya Nugraha","72170117",
                "Laki-laki","Maingame","Jadi Kaya","Hidup Harus Santai",R.drawable.daniel));
    }

}
