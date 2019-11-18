package bakeli.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView monTexte = null;
    Button premier = null;
    Button second=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        premier = new Button(this);
        second=new Button(this);
        // Et on attribue le Spanned au bouton
        premier.setText(R.string.premier);
        second.setText(R.string.second);

        setContentView(premier);
        setContentView(second);





    }
}
