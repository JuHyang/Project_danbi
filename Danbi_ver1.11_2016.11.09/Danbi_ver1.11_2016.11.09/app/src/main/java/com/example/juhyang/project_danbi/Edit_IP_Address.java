package com.example.juhyang.project_danbi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Edit_IP_Address extends AppCompatActivity {

    EditText editText_ip, editText_port1, editText_port2;
    Button btn_ok;

    String ip;
    int port1, port2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__ip_adress);

        aboutView();
    }

    public void initView () {
        editText_ip = (EditText) findViewById(R.id.edit_ip);
        editText_port1 = (EditText) findViewById(R.id.edit_port1);
        editText_port2 = (EditText) findViewById(R.id.edit_port2);
        btn_ok = (Button) findViewById(R.id.btn_ok);
    }

    public void aboutView() {
        initView();

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip = editText_ip.getText().toString();
                port1 = Integer.parseInt(editText_port1.getText().toString());
                port2 = Integer.parseInt(editText_port2.getText().toString());
                if (ip.equals("") || editText_port1.getText().toString().equals("") || editText_port2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "빈칸 없이 모두 입력 해 주세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                    intent.putExtra("ip", ip);
                    intent.putExtra("port1", port1);
                    intent.putExtra("port2", port2);

                    startActivity(intent);
                    finish();
                }
            }
        });

    }
}
