package ma.enset.tp1_splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UserInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        TextView usernameTextView = findViewById(R.id.usernameInfo);
        TextView passwordTextView = findViewById(R.id.passwordInfo);

        Bundle bundle = getIntent().getBundleExtra("bundle");
        String username = bundle.getString("username")+" : ";
        String password = bundle.getString("password")+" : ";

        usernameTextView.setText(usernameTextView.getText().toString().concat(username));
        passwordTextView.setText(passwordTextView.getText().toString().concat(password));

    }

    public void backToHome(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}