package java.tata.shubham.project;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityReg extends AppCompatActivity {
    private static final String KEY_STATUS = "status";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_Address = "address";
    private static final String KEY_reception_Id = "Id";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_EMPTY = "confirmPassword";
    private static final String KEY_Number = "contact";
    private ProgressDialog pDialog;
    // private String login_url =;
    ;

    private String Id;
    private String username;
    private String password;
    private String confirmPassword;
    private String Address;
    private String Contact;


    private EditText etUsername;
    private EditText receptionId;
    private EditText etAddress;
    private EditText etPassword;
    private EditText etConfirmPassword;
    private EditText etContact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        receptionId = findViewById(R.id.receptionId);
        etUsername = findViewById(R.id.etusername_id);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        etAddress = findViewById(R.id.etAddress);
        etContact = findViewById(R.id.etContact);

        Button login = findViewById(R.id.Login_btn);
        Button register = findViewById(R.id.btnRegister);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityReg.this, MainActivity.class);
                startActivity(i);
                Toast.makeText(MainActivityReg.this, "Register", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
