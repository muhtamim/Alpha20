 package muhtamimfuwadnahid.example.com.doctorappdrug_directory;

 import android.content.Intent;
 import android.os.Bundle;
 import android.os.Handler;
 import android.support.v7.app.AppCompatActivity;
 import android.widget.ProgressBar;

 import com.github.ybq.android.spinkit.sprite.Sprite;
 import com.github.ybq.android.spinkit.style.CubeGrid;

 public class SplashActivity extends AppCompatActivity {
     ProgressBar progress;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_splash);

         progress = (ProgressBar) findViewById(R.id.progress_bar_id);
         Sprite CubeGrid = new CubeGrid();
         progress.setIndeterminateDrawable(CubeGrid);

         Thread thread = new Thread() {
             @Override
             public void run() {
                 super.run();
                 for (int i = 0; i < 100; ) {
                     try {
                         sleep(300);
                     } catch (Exception ex) {
                         ex.printStackTrace();
                     }
                     progress.setProgress(0);
                     i = i + 10;

                 }
                 startActivity(new Intent(getApplicationContext(), MainActivity.class));
                 finish();

             }
         };
         thread.start();

     }
 }
