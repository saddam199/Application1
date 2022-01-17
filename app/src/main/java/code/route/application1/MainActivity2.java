package code.route.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity2 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pdfView=findViewById(R.id.pdfView);

        int story_position=getIntent().getIntExtra("key_position",0);

        if (story_position==0){
            pdfView.fromAsset("taxi.pdf").load();
        }
        if (story_position==1){
            pdfView.fromAsset("td.pdf").load();
        }
        if (story_position==2){
            pdfView.fromAsset("tm.pdf").load();
        }

        if (story_position==3){
            pdfView.fromAsset("tmp.pdf").load();
        }
        if (story_position==4){
            pdfView.fromAsset("tv.pdf").load();
        }
        if (story_position==5){
            pdfView.fromAsset("code.pdf").load();
        }

    }
}