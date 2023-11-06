package pe.edu.idat.appsimplerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

import pe.edu.idat.appsimplerecyclerview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AdapterLista adapterLista= new AdapterLista();
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rvinfo.setLayoutManager(
                new LinearLayoutManager(getApplicationContext())

        );
        binding.rvinfo.setAdapter(adapterLista);
        adapterLista.setLista(getData());

    }


    private ArrayList<String> getData (){

        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i< 20; i++){
            lista.add("Dato:" + i);

        }
        return lista;
    }
}