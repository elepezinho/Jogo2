package com.progame.guessmovie;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.progame.guessmovie.about.AboutActivity;
import com.progame.guessmovie.repositorio.DbCargaAnimes;
import com.progame.guessmovie.repositorio.DbCargaConfig;
import com.progame.guessmovie.repositorio.DbCargaFilmes;
import com.progame.guessmovie.repositorio.DbCargaGames;
import com.progame.guessmovie.repositorio.DbCargaSeries;
import com.progame.guessmovie.repositorio.DbHelper;

//import com.google.firebase.iid.FirebaseInstanceId;
//import com.google.firebase.iid.InstanceIdResult;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button bt_start;
    private ImageView img_star;
    private ImageView img_info;

    //Usar para reiniciar as preferencias do app
    SharedPreferences pref;

    private Boolean jaAcessou;
    public Boolean jaAvaliou;
    public int versaoBD;
    private int moeda;
    public int valorMoedas = 300;
    public DbCargaConfig dbCargaConfig;
    public DbCargaFilmes dbCargaFilmes;
    public DbCargaSeries dbCargaSeries;
    public DbCargaAnimes dbCargaAnimes;
    public DbCargaGames dbCargaGames;

    public SQLiteDatabase db;
    public DbHelper dbHelper;

    private static final String TAG = "token firebase";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // [START retrieve_current_token]
  /*   FirebaseInstanceId.getInstance().getInstanceId()
                .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
                    @Override
                    public void onComplete(@NonNull Task<InstanceIdResult> task) {
                        if (!task.isSuccessful()) {
                            Log.w(TAG, "getInstanceId failed", task.getException());
                            return;
                        }

                        // Get new Instance ID token
                        String token = task.getResult().getToken();

                        // Log and toast
                        String msg =  token;
                        Log.d(TAG, msg);
                        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });
        // [END retrieve_current_token]*/

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        dbHelper = new DbHelper(getBaseContext());

        //versaoBD = 99;
        if(versaoBD != DbHelper.DATABASE_VERSION) {

            DbHelper dbHelper = new DbHelper(getBaseContext());
            dbCargaConfig = new DbCargaConfig(dbHelper);
            dbCargaFilmes = new DbCargaFilmes(dbHelper);
            dbCargaSeries = new DbCargaSeries(dbHelper);
            dbCargaAnimes = new DbCargaAnimes(dbHelper);
            dbCargaGames = new DbCargaGames(dbHelper);

            dbCargaFilmes.inserirFases();
            dbCargaSeries.inserirFases();
            dbCargaAnimes.inserirFases();
            dbCargaGames.inserirFases();
            dbCargaConfig.inserirConfig();

            SharedPreferences.Editor editor;
            editor = getSharedPreferences("pref", MODE_PRIVATE).edit();
            editor.putInt("versao_banco", DbHelper.DATABASE_VERSION);
            editor.commit();
        }

        bt_start = (Button) findViewById(R.id.bt_start);
        //final MediaPlayer mp = MediaPlayer.create(this, R.raw.bolha);
        img_star = (ImageView) findViewById(R.id.img_star);
        img_info = (ImageView) findViewById(R.id.img_info);


        bt_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, CategoriesActivity.class);
                startActivity(intent);
        //        mp.start();
                overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                onPause();
            }
        });

        img_star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(jaAvaliou == false) {
                    showRateDialog(view.getContext());
                } else {
                    Toast.makeText(
                            MainActivity.this,
                            "Você já avaliou nosso jogo na Play Store. Obrigado! ^^",
                            Toast.LENGTH_LONG
                    ).show();
                }
            }
        });

        img_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        final View decorview = getWindow().getDecorView();
        decorview.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);

        decorview.setOnSystemUiVisibilityChangeListener(
                new View.OnSystemUiVisibilityChangeListener() {
                    @Override
                    public void onSystemUiVisibilityChange(int i) {
                        decorview.setSystemUiVisibility(
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                                        | View.SYSTEM_UI_FLAG_IMMERSIVE);
                    }
                }
        );

        pref = getSharedPreferences("pref", MODE_PRIVATE);
        jaAcessou = pref.getBoolean("ja_acessou", false);
        jaAvaliou = pref.getBoolean("ja_avaliou", false);
        versaoBD = pref.getInt("versao_banco", 0);
        moeda = pref.getInt("qt_moedas", valorMoedas);
    }

    public void showRateDialog(final Context context){
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle("Rate on Play Store")
                .setMessage("Tell us what you think about our game on the Play Store")
                .setPositiveButton("RATE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (context != null){
                            String link = "market://details?id=";
                            try {
                                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                            } catch (PackageManager.NameNotFoundException e){
                                e.printStackTrace();
                                link = "https://play.google.com/store/apps/details?id=";
                            }
                            ganharMoedas();
                            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(link + context.getPackageName())));

                        }
                    }
                }).setNegativeButton("CANCEL", null);
        builder.show();
    }

    public void ganharMoedas(){
        SharedPreferences.Editor editor;
        editor = getSharedPreferences("pref", MODE_PRIVATE).edit();
        editor.putInt("qt_moedas", moeda+0);
        editor.putBoolean("ja_avaliou", false);
        editor.commit();
        jaAvaliou = false;
    }
}