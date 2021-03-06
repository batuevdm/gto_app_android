package ru.batuevdm.gto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonDisc = (Button) findViewById(R.id.buttonDisc);
        Button buttonNorm = (Button) findViewById(R.id.buttonNorm);
        Button buttonNagr = (Button) findViewById(R.id.buttonNagr);
        Button buttonAbbit = (Button) findViewById(R.id.buttonAbbit);

        View.OnClickListener onClickButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent;
                switch (v.getId()) {
                    case R.id.buttonDisc:
                        intent = new Intent(MainActivity.this, DiscActivity.class);
                        break;
                    case R.id.buttonNorm:
                        intent = new Intent(MainActivity.this, NormActivity.class);
                        break;
                    case R.id.buttonNagr:
                        intent = new Intent(MainActivity.this, NagrActivity.class);
                        break;
                    case R.id.buttonAbbit:
                        intent = new Intent(MainActivity.this, AbbitActivity.class);
                        break;
                    default:
                        intent = new Intent(MainActivity.this, MainActivity.class);
                        break;
                }
                startActivity(intent);

            }
        };

        buttonDisc.setOnClickListener(onClickButton);
        buttonNorm.setOnClickListener(onClickButton);
        buttonNagr.setOnClickListener(onClickButton);
        buttonAbbit.setOnClickListener(onClickButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the main; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.disc_description_text) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
