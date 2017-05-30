package com.martin.tspz_lab1;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText edtTxt;
    private ImageView img;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        img = (ImageView) findViewById (R.id.imageView);
        button = (Button) findViewById (R.id.button);
        edtTxt = (EditText) findViewById (R.id.editText);
    }

    public void onImageClick (View v) {
        if (count==0) {
            Toast toast = Toast.makeText(getApplicationContext(), "Представьтесь, для начала!\nНе стесняйтесь :)", Toast.LENGTH_SHORT);
            toast.show();
        }
        if(count>=1)
        {
            Intent intent;
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com/ru/itunes/charts/free-apps/"));
            startActivity(intent);
        }
    }

    public void onButtonClick (View v) {
        if (edtTxt.getText().toString().equals("")) {
            Toast toast = Toast.makeText(getApplicationContext(), "Введите свое имя!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Здравствуйте, " + edtTxt.getText() + "!\nДобро пожаловать!", Toast.LENGTH_LONG);
            toast.show();
            img.setImageResource(R.drawable.appstore);
            button.setText("Очень приятно!");
            count++;
        }
    }
}
