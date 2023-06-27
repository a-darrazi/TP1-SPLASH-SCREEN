package ma.enset.tp1_splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener((view)->{
            onLogin();
        });
    }

    private void onLogin(){
        EditText usernameInput = findViewById(R.id.username);
        EditText passwordInput = findViewById(R.id.password);
        String username = usernameInput.getText().toString();
        String password = passwordInput.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("username",username);
        bundle.putString("password", password);
        Intent intent = new Intent(this, UserInfo.class);
        intent.putExtra("bundle", bundle);
        startActivity(intent);

        usernameInput.setText("");
        passwordInput.setText("");
    }

    @Override
    protected void onStart() {
        Toast toast = Toast.makeText(this, "onStart", Toast.LENGTH_LONG);
        toast.show();
        super.onStart();
    }

    @Override
    protected void onResume() {
        Toast toast = Toast.makeText(this, "onResume", Toast.LENGTH_LONG);
        toast.show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast toast = Toast.makeText(this, "onPause", Toast.LENGTH_LONG);
        toast.show();
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Toast toast = Toast.makeText(this, "onRestart", Toast.LENGTH_LONG);
        toast.show();
        super.onRestart();
    }

    @Override
    protected void onStop() {
        Toast toast = Toast.makeText(this, "onStop", Toast.LENGTH_LONG);
        toast.show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG);
        toast.show();
        super.onDestroy();
    }
}