package com.example.salesmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VerRopaActivity extends AppCompatActivity {

    Main main;

    public void launchAgregarProducto(View v){
        Intent i = new Intent(this,CrearProductoActivity.class);
        startActivity(i);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_ropa);

       /* final ListView listview = (ListView) findViewById(R.id.listviewProducts);

        final ArrayList<Producto> list = new ArrayList<Producto>();
        for (int i = 0; i < main.productos.size(); ++i) {
            list.add(main.productos.get(i));
        }
        final StableArrayAdapter adapter = new StableArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                    final String item = (String) parent.getItemAtPosition(position);
                    view.animate().setDuration(2000).alpha(0)
                            .withEndAction(new Runnable() {
                                @Override
                                public void run() {
                                    list.remove(item);
                                    adapter.notifyDataSetChanged();
                                    view.setAlpha(1);
                                }
                            });
                }

            });
        }

        private class StableArrayAdapter extends ArrayAdapter<Producto> {

            HashMap<Producto, Integer> mIdMap = new HashMap<Producto, Integer>();

            public StableArrayAdapter(Context context, int textViewResourceId,
                                      List<Producto> objects) {
                super(context, textViewResourceId);
                for (int i = 0; i < objects.size(); ++i) {
                    mIdMap.put(objects.get(i), i);
                }
            }

            @Override
            public long getItemId(int position) {
                Producto item = getItem(position);
                return mIdMap.get(item);
            }

            @Override
            public boolean hasStableIds() {
                return true;
            }*/

        }

}