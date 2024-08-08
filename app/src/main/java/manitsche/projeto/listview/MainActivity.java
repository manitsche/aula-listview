package manitsche.projeto.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {"Angra dos Reis", "Caudas Novas", "Campos do Jordão", "Florianópolis", "São Paulo", "Rio de Janeiro",
            "Gramado", "Bonito", "Foz do Iguaçu", "Salvador", "Porto Alegre", "Belo Horizonte", "Porto Seguro", "Maceió", "Cascavel",
            "Toledo", "Corbelia", "Braganey"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        // Criar adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1, // layout da lista - pode ser customizado
                android.R.id.text1, // id do layout - ctrl + clicar no layout
                itens
        );

        // Adicionar para a Lista
        listLocais.setAdapter(adaptador);

        // Adicionar clique na Lista
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorSelecionado = listLocais.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_LONG).show();
            }
        });
    }
}