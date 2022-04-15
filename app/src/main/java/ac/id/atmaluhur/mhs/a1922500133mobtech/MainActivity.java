package ac.id.atmaluhur.mhs.a1922500133mobtech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText absensi;
    EditText tugas;
    EditText uts;
    EditText uas;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        absensi = (EditText) findViewById(R.id.absensi);
        tugas = (EditText) findViewById(R.id.tugas);
        uts = (EditText) findViewById(R.id.uts);
        uas = (EditText) findViewById(R.id.uas);
        hasil = (TextView) findViewById(R.id.hasil);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void hitung(View View) {
        Integer a = Integer.parseInt(absensi.getText().toString());
        Integer b = Integer.parseInt(tugas.getText().toString());
        Integer c = Integer.parseInt(uts.getText().toString());
        Integer d = Integer.parseInt(uas.getText().toString());
        Integer e = a * 10 / 100 + b * 20 / 100 + c * 30 / 100 + d * 40 / 100;
        hasil.setText("Hasil =" + e);
    }
}