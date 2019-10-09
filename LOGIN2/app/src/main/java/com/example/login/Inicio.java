package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {
    ImageButton libro1,libro2;
    ImageView imagen;
    TextView descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        libro1=(ImageButton)findViewById(R.id.imageButton);
        libro2=(ImageButton)findViewById(R.id.imageButton2);
        imagen=(ImageView)findViewById(R.id.imageView2);
    }
    public void Libro1(View view){
        Intent intent3 = new Intent(view.getContext(),Descripcion.class);
        startActivityForResult(intent3,0);
        Intent i= new Intent(view.getContext(),Descripcion.class);
        i.putExtra("Libro1","Titulo: Fortaleza digital\nAutor: Dan Brown\n Sinopsis: Trata de una mujer que trabaja en un programa que " +
                "desincripta todos los archivos en internet");
        startActivity(i);
    }
    public void Libro2(View view){
        Intent intent4= new Intent(view.getContext(),Libro2.class);
        startActivityForResult(intent4,0);
        Intent i2= new Intent(view.getContext(),Libro2.class);
        i2.putExtra("Libro2","Titulo: Steve Jobs\nAutor: Walter Issacson\n Sinopsis: Es la biografia de la vida del fundador de la empresa Apple");
        startActivity(i2);
    }
    public void Libro3(View view){
        Intent in=new Intent(view.getContext(),Libro3.class);
        startActivityForResult(in,0);
        Intent i3=new Intent(view.getContext(),Libro3.class);
        i3.putExtra("Libro3","Titulo: Nunca pares\nAutor: Phil Knight\nSinopsis:Phil Knight habla por primera vez de la auténtica historia detrás de Nike, la empresa que fundó en 1962, que hoy factura más de 30 000 millones de dólares al año, y cuyo logo ha llegado a ser un símbolo global, el icono más ubicuo y reconocido en todo el mundo. Todo comenzó con 50 dólares y una idea sencilla: importar calzado deportivo económico y de gran calidad desde Japón. Vendiendo esos tenis en la cajuela de su coche, Phil Knight consiguió facturar 8 000 dólares durante el primer año. Progresivamente, este pequeño negocio se convirtió en una start-up exitosa que revolucionó el mercado, creó una marca universal e innovadora y evolucionó hasta convertirse en el gigante actual. En estas memorias sinceras y viscerales, Phil Knight relata los numerosos riesgos asumidos, los reveses sufridos y los incipientes éxitos, pero sobre todo la relación con sus primeros colaboradores y empleados, un grupo de inconformistas y luchadores que acabaron sintiéndose como hermanos. Juntos, animados por la fuerza de un objetivo común y una fe profunda en el espíritu del deporte, construyeron una marca que transformó todos los cánones establecidos. Otros autores y personalidades han opinado: Conozco a Phil Knight desde que era niño, pero en realidad no lo descubrí hasta que abrí este magnífico libro tan personal. Lo mismo me ha ocurrido con Nike. Había usado su material con orgullo, pero no era consciente del conjunto de logros extraordinarios, innovación, supervivencia y triunfo que hay detrás del logo de esta marca. Sincero, entretenido y elegante, éste es un relato para todos aquellos a quienes les guste el deporte, pero sobre todo para quienes adoran las memorias. -Andre Agassi, autor del bestseller Open- Nunca pares es una magnífica historia sobre la suerte, el coraje, el aprendizaje y la alquimia mágica de un puñado de personajes excéntricos que se reunieron para crear Nike. Las lecciones que encontramos en este libro acerca de la emprendeduría y los obstáculos que vamos encontrando cuando queremos crear algo nuevo no tienen precio. -Abraham Verghese, autor de Hijos del ancho mundo- Una conmovedora y entretenida aventura, una auténtica odisea con mucho que enseñar sobre innovación y creatividad. Phil Knight nos lleva hasta los inicios de la marca Nike y recuerda cómo tuvo que suplicar para conseguir dinero de unos bancos muy reacios y cómo tuvieron que trabajar juntos para construir algo único y revolucionario.");
        startActivity(i3);
    }
}
