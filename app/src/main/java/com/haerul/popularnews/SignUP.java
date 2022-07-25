package com.haerul.popularnews;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUP extends AppCompatActivity  implements View.OnClickListener{
    Button btn_in,btn_np;
    Button but_e,but_t,but_k,but_h,but_m;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        btn_in=(Button) findViewById(R.id.but_in);
        btn_in.setOnClickListener(this);
        btn_np=(Button) findViewById(R.id.but_NP);
        btn_np.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        if(view.equals(btn_np)){
            setContentView(R.layout.papers);
            but_e= (Button) findViewById(R.id.but_e);
            but_e.setOnClickListener(this);
            but_k= (Button) findViewById(R.id.but_k);
            but_k.setOnClickListener(this);
            but_t= (Button) findViewById(R.id.but_t);
            but_t.setOnClickListener(this);
            but_h=(Button) findViewById(R.id.but_h);
            but_h.setOnClickListener(this);
            but_m=(Button) findViewById(R.id.but_m);
            but_m.setOnClickListener(this);

        }

        else if(view.equals(but_k)){
            Uri uri = Uri.parse("https://kpepaper.asianetnews.com/3515094/Bengaluru/Bengaluru#page/1/1");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

        }else if(view.equals(but_e)){
            //https://epaper.hindustantimes.com/delhi?eddate=23/06/2022&pageid=429857
            Uri uri = Uri.parse("https://epaper.hindustantimes.com/delhi?");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }else if(view.equals(but_t)){
            Uri uri = Uri.parse("https://epaper.eenadu.net/Home/Index?");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

        }else if(view.equals(but_h)) {
            Uri uri = Uri.parse("https://epaper.livehindustan.com/Home/ArticleView?utm_source=lhepaper&utm_medium=otherpublication");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

        }else if(view.equals(but_m)) {
            Uri uri = Uri.parse("https://keralakaumudi.com/epaper/article");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        else if(view.equals(btn_in)){
            Toast.makeText(getBaseContext(), "GET UPDATED ALL THE TIME", Toast.LENGTH_SHORT).show();
            Intent it = new Intent(this,MainActivity.class);
            startActivity(it);
        }

    }

}
