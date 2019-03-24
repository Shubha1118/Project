package java.tata.shubham.project;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private static final String KEY_STATUS = "status";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_FULL_NAME = "full_name";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";
    private EditText etUsername;
    private EditText etPassword;
    private String username;
    private String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.username_id);
        etPassword = findViewById(R.id.pass_id);

        Button register = findViewById(R.id.btnRegister);
        Button login = findViewById(R.id.btnLogin);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivityReg.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, " Log in", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}