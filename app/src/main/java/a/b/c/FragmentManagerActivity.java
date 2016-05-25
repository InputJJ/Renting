package a.b.c;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import a.b.fragment.PersonalDataFragment;
import a.b.fragment.SetFragment;

public class FragmentManagerActivity extends AppCompatActivity {

    SetFragment setFragment;
    PersonalDataFragment personalDataFragment;

    int id=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_manager);
        id=this.getIntent().getExtras().getInt("fragmentNumber");

        FragmentManager manager=this.getFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();

        switch (id){
            case 1:
                setFragment=new SetFragment();
                transaction.replace(R.id.id_content,setFragment);
                break;
            case 2:
                personalDataFragment=new PersonalDataFragment();
                transaction.replace(R.id.id_content,personalDataFragment);
                break;
        }
        transaction.commit();


    }
}
