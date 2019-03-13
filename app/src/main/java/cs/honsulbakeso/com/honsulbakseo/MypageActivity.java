package cs.honsulbakeso.com.honsulbakseo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MypageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        Button btnMenu = (Button)findViewById(R.id.Menu);
        Button btnFollow = (Button)findViewById(R.id.Follow);
        Button btnLikeRecipe = (Button)findViewById(R.id.LikeRecipe);
        Button btnDiary = (Button)findViewById(R.id.Diary);

        TextView level=(TextView)findViewById(R.id.Level);
        TextView name=(TextView)findViewById(R.id.Name);

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(), recipeboardActivity.class);  //팔로우
                startActivity(intent);
            }
        });
        btnLikeRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(), recipeboardActivity.class);  //찜한 레시피
                startActivity(intent);
            }
        });
        btnDiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(), recipeboardActivity.class);      //다이어리
                startActivity(intent);
            }
        });

    }
}
