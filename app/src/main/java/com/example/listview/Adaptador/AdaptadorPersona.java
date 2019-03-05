package com.example.listview.Adaptador;

import android.app.Person;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.listview.Modelo.Persona;
import com.example.listview.R;

import java.util.List;

public class AdaptadorPersona extends BaseAdapter {

    private List<Persona> listpersona;
    private Context context;

    public AdaptadorPersona(List<Persona> listpersona, Context context) {
        this.listpersona = listpersona;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listpersona.size();
    }

    @Override
    public Object getItem(int position) {
        return listpersona.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listpersona.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(R.layout.row,null);

        Persona p= listpersona.get(position);

        TextView nom = convertView.findViewById(R.id.nom);
        nom.setText(p.getNombre());

        TextView ape =convertView.findViewById(R.id.ape);
        ape.setText(p.getApellido());

        TextView edad= convertView.findViewById(R.id.age);
        edad.setText(p.getEdad().toString());

        return convertView;

    }
}
