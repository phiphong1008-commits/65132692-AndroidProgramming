package dpphong.ntu.vieccanlam;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;


public class ThemTASKS extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.them_task);
        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtName = findViewById(R.id.editTextTextName);
                EditText edtDate = findViewById(R.id.editTextTextDate);
                EditText edtMes = findViewById(R.id.editTextTextMes);
                EditText edtPri = findViewById(R.id.editTextTextPri);

                String str_name = edtName.getText().toString();
                String str_date = edtDate.getText().toString();
                String str_mes = edtMes.getText().toString();
                String str_pri = edtPri.getText().toString();

                TASKS tasks = new TASKS(str_name,str_date,str_mes,str_pri);
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("TASKS");
                String key = myRef.push().getKey();
                HashMap<String, Object> item = new HashMap<String,Object>();
                item.put(key,tasks.toFirebaseOB());

                myRef.updateChildren(   item, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                        if (error == null) finish();
                    }
                });


            }
        });
    }


}
